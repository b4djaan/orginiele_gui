module org.guardiansofthewasteland.orginiele_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.guardiansofthewasteland.orginiele_gui to javafx.fxml;
    exports org.guardiansofthewasteland.orginiele_gui;
}