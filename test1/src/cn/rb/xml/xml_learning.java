package cn.rb.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author ：rb
 * 1. dom 解析xml
 * document object model 文档对象模型
 * @version:
 */
public class xml_learning {
    public static void main(String[] args) {
        //创建一个documentbuilderfactory 对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            // 创建一个DocumentBuilder对象
            DocumentBuilder db = dbf.newDocumentBuilder();
            //通过DocumentBuilder对象的parse方法加载xml文件到当前项目下
            Document document = db.parse("test1/src/cn/rb/xml/study.xml");
            //获取所有的country节点的集合NodeList
            NodeList countryList = document.getElementsByTagName("country");
            //看一下有一共有多少个country
            System.out.println("一共有 " + countryList.getLength() + "个国家");
            //遍历每一个country节点获取信息
            for (int i = 0; i < countryList.getLength(); i++) {
                System.out.println("====开始遍历第" + (i + 1) + "个国家====");
                //通过NodeList对象的item(i) 方法获得一个country节点
                Node country = countryList.item(i);
                //获得所有属性
                NamedNodeMap attrs = country.getAttributes();
                System.out.println("第" + (i + 1) + "个国家共有" + attrs.getLength() + "个属性");
                //遍历所有的属性
                for (int j = 0; j < attrs.getLength(); j++) {
                    //通过item（i）获得某个属性
                    Node attr = attrs.item(j);
                    //获取属性的名字
                    System.out.println("属性名" + attr.getNodeName());
                    //获取属性值
                    System.out.println("属性值" + attr.getNodeValue());
                }
                //解析country节点的子节点
                NodeList childNodes = country.getChildNodes();
                //遍历每一个childNodes获取节点名和节点值
                System.out.println("第" + (i + 1) + "个国家共有" + childNodes.getLength() + "个子节点");
                for (int k = 0; k < childNodes.getLength(); k++) {
                    //区分是text类型还是elements类型
                    //System.out.println(childNodes.item(k).getNodeType());
                    if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println("element node  "+childNodes.item(k).getNodeType());
                        if (childNodes.item(k).hasChildNodes()) {
                            //获取element类型节点的节点名、节点值
                            System.out.println("第" + (k + 1) + "个节点的节点名：" + childNodes.item(k).getNodeName());
                            System.out.println("第" + (k + 1) + "个节点的节点值：" + childNodes.item(k).getFirstChild().getNodeValue());
                            if (childNodes.item(k).hasAttributes()) {
                                NamedNodeMap attri = childNodes.item(k).getAttributes();
                                for (int j = 0; j < attri.getLength(); j++) {
                                    System.out.println("属性值=" + attri.item(j).getNodeName());
                                    System.out.println("属性名=" + attri.item(j).getNodeValue());
                                }
                            }

                        } else{
                            System.out.println(childNodes.item(k).getNodeName());
                            if (childNodes.item(k).hasAttributes()) {
                                NamedNodeMap attri = childNodes.item(k).getAttributes();
                                for (int j = 0; j < attri.getLength(); j++) {
                                    System.out.println("属性值=" + attri.item(j).getNodeName());
                                    System.out.println("属性名=" + attri.item(j).getNodeValue());
                                }
                            }
                        }

                    }else{
                        System.out.println(childNodes.item(k).getTextContent());
                    }


                }
                System.out.println("====第" + (i + 1) + "个国家遍历结束" + "====");
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
