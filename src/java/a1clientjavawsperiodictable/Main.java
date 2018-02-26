/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1clientjavawsperiodictable;

import javax.xml.ws.WebServiceRef;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author gonca
 */
public class Main {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/www.webservicex.com/periodictable.asmx.wsdl")
    private static net.webservicex.Periodictable service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Serializer serializer = new Persister();
            String source = getAtomicNumber("Gold");
            DataSet DataSet = new DataSet();
            serializer.read(DataSet, source);

            System.out.println(DataSet.getTable().getAtomicNumber());
            System.out.println(DataSet.getTable().getElementName());
            System.out.println(DataSet.getTable().getSymbol());
            System.out.println(DataSet.getTable().getAtomicWeight());
            System.out.println(DataSet.getTable().getBoilingPoint());
            System.out.println(DataSet.getTable().getIonisationPotential());
            System.out.println(DataSet.getTable().getEletroNegativity());
            System.out.println(DataSet.getTable().getAtomicRadius());
            System.out.println(DataSet.getTable().getMeltingPoint());
            System.out.println(DataSet.getTable().getDensity());
        } catch (Exception e) {
        }

    }

    private static String getAtomicNumber(java.lang.String elementName) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    
}
