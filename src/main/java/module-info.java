module com.app.rtk_manager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires com.fazecast.jSerialComm;
    requires MaterialFX;
    requires com.dlsc.formsfx;

    opens com.app.rtk_manager to javafx.fxml;
    exports com.app.rtk_manager;
}