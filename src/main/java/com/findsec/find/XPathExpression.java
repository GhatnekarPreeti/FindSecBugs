package com.findsec.find;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.InputSource;

/**
 * Hello world!
 *
 */
public class XPathExpression 
{
    public static void main( String[] args ) throws ParserConfigurationException, FileNotFoundException, XPathExpressionException
    {
    	DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
    	DocumentBuilder builder = df.newDocumentBuilder();
    	XPathFactory xPathFactory = XPathFactory.newInstance();
    	XPath xpath = xPathFactory.newXPath();
    	javax.xml.xpath.XPathExpression xPathExpr = xpath.compile("/somepath/text()");
    	InputStream inputStream = new FileInputStream("");
    	xPathExpr.evaluate(new InputSource(inputStream));
    }
}
