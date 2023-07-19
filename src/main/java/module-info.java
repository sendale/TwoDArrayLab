module com.example.twodarraylab {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.twodarraylab to javafx.fxml;
    exports com.example.twodarraylab;
}