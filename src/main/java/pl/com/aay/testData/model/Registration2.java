package pl.com.aay.testData.model;

// czy klasa Registartion to jest moja klasa ? jeśli tak to wyrażenie public Registration2(){
//            super();
//        }
// jest niepotrzebne ponieważ koja klasa Registration nie ma żadnego konstuktora

public class Registration2 extends Registration {
        public String streetName;
        public String city;
        public String zipCode;
        public String state;

        public Registration2(){
            super();
        }
}
