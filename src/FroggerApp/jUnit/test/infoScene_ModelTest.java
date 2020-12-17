//package FroggerApp.jUnit.test;
//
//import FroggerApp.Info_Scene.infoScene_Model;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//
///**
// * To test without create an instance of button will provide error
// * @author Jason
// *
// */
//
//public class infoScene_ModelTest {
//
//        private infoScene_Model model;
//
//        @Rule
//        public ExpectedException thrown = ExpectedException.none();
//
//        @Test
//        public void InvalidStartButtonTest(){
//            thrown.expect(NullPointerException.class);
//            model = new infoScene_Model(model.getInfoStage());
//            model.setButton(model.getButton());
//    }
//
//}