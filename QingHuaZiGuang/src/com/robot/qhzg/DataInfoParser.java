package com.robot.qhzg;

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
	static final String IMAGE = "Image";
	static final String STRING = "String";
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
				String string = null;
				String image = null;
				String sound = null;
				short action = 0;
				Node item = items.item(i);
				NodeList properties = item.getChildNodes();
				for (int j = 0; j < properties.getLength(); j++) {
					Node property = properties.item(j);
					String name = property.getNodeName();
					if (name.equalsIgnoreCase(STRING)) {
						string = property.getFirstChild().getNodeValue();
					} else if (name.equalsIgnoreCase(IMAGE)) {
						image = property.getFirstChild().getNodeValue();
					} else if (name.equalsIgnoreCase(SOUND)) {
						sound = property.getFirstChild().getNodeValue();
					} else if (name.equalsIgnoreCase(ACTION)) {
						String str = property.getFirstChild().getNodeValue();
						str = str.replaceFirst("0X", "");
						str = str.replaceFirst("0x", "");
						action = Short.parseShort(str, 16);
					}
				}
				dataInfos.add(new DataInfo(string, image, sound, action));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return dataInfos;
	}
}
