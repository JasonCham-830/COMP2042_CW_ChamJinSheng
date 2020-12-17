//package FroggerApp.jUnit.test;
//
//import FroggerApp.Menu_Scene.menuScene_Model;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//
//import java.rmi.server.ExportException;
//
//import static org.junit.Assert.*;
//
///**
// * To test without create an instance of button will provide error
// * @author Jason
// *
// */
//public class menuScene_ModelTest {
//
//    private menuScene_Model model;
//
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void InvalidInfoButtonTest(){
//        thrown.expect(NullPointerException.class);
//        model = new menuScene_Model();
//        model.setInfoButton(model.getInfoButton());
//    }
//}