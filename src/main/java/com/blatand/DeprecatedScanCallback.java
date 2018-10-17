package com.blatand;

import java.util.List;

import android.bluetooth.BluetoothDevice;

public interface DeprecatedScanCallback
{
    public void OnLeScan(BluetoothDevice device, int rssi);
}
