package com.robot.manager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DataInfoParser {
	static final String DATA = "Data";
	static final String INTERRUPT = "Interrupt";
	static final String SOUND = "Sound";
	static final String ACTION = "Action";
	private File mFile;

	public DataInfoParser(File file) {
		mFile = file;
	}
	
	public List<DataInfo> parse() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		List<DataInfo> dataInfos = new ArrayList<DataInfo>();

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document dom = builder.parse(mFile);
			Element root = dom.getDocumentElement();
			NodeList items = root.getElementsByTagName(DATA);
			for (int i = 0; i < items.getLength(); i++) {
				short interrupt = 0;
				ArrayList<String> soundList = new ArrayList<String>();
				short action = 0;
				Node item = items.item(i);
				NodeList properties = item.getChildNodes();
				for (int j = 0; j < properties.getLength(); j++) {
					Node property = properties.item(j);
					String name = property.getNodeName();
					if (name.equalsIgnoreCase(INTERRUPT)) {
						String str = property.getFirstChild().getNodeValue();
						str = str.replaceFirst("0X", "");
						str = str.replaceFirst("0x", "");
						interrupt = Short.parseShort(str, 16);
					} else if (name.equalsIgnoreCase(SOUND)) {
						String sound = property.getFirstChild().getNodeValue();
						soundList.add(sound);
					} else if (name.equalsIgnoreCase(ACTION)) {
						String str = property.getFirstChild().getNodeValue();
						str = str.replaceFirst("0X", "");
						str = str.replaceFirst("0x", "");
						action = Short.parseShort(str, 16);
					}
				}
				dataInfos.add(new DataInfo(interrupt, soundList, action));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return dataInfos;
	}
}
