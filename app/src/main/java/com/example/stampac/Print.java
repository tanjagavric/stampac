package com.example.stampac;

//import com.dantsu.escposprinter.connection.DeviceConnection;



public class Print {

    public void printBold(String text) {
        //BluetoothConnection btPrinter;

    }
    /*
    public void printBluetooth(String macAddress, String payload, boolean autoCut, boolean openCashbox, double mmFeedPaper, double printerDpi, double printerWidthMM, double printerNbrCharactersPerLine, Promise promise) {
        this.jsPromise = promise;
        BluetoothConnection btPrinter;

        if (TextUtils.isEmpty(macAddress)) {
            btPrinter = BluetoothPrintersConnections.selectFirstPaired();
        } else {
            btPrinter = getBluetoothConnectionWithMacAddress(macAddress);
        }

        if (btPrinter == null) {
            this.jsPromise.reject("Connection Error", "Bluetooth Device Not Found");
        }

        if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.S && ContextCompat.checkSelfPermission(getCurrentActivity(), Manifest.permission.BLUETOOTH) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getCurrentActivity(), new String[]{Manifest.permission.BLUETOOTH}, 1);
        } else if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.S && ContextCompat.checkSelfPermission(getCurrentActivity(), Manifest.permission.BLUETOOTH_ADMIN) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getCurrentActivity(), new String[]{Manifest.permission.BLUETOOTH_ADMIN}, 1);
        } else if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S && ContextCompat.checkSelfPermission(getCurrentActivity(), Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getCurrentActivity(), new String[]{Manifest.permission.BLUETOOTH_CONNECT}, 1);
        } else if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S && ContextCompat.checkSelfPermission(getCurrentActivity(), Manifest.permission.BLUETOOTH_SCAN) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getCurrentActivity(), new String[]{Manifest.permission.BLUETOOTH_SCAN}, 1);
        } else {
            try {
                this.printIt(btPrinter.connect(), payload, autoCut, openCashbox, mmFeedPaper, printerDpi, printerWidthMM, printerNbrCharactersPerLine);
            } catch (Exception e) {
                this.jsPromise.reject("Connection Error", e.getMessage());
            }
        }
    }

     */

}
