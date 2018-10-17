package com.blatand;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.util.Log;

public class GattCallbackInterfacer extends android.bluetooth.BluetoothGattCallback
{
    private com.blatand.GattCallback m_interface;

    public GattCallbackInterfacer(com.blatand.GattCallback inter) {
        m_interface = inter;
    }

    public void onServicesDiscovered(BluetoothGatt gatt, int status) {
        Log.i("Unity", "Bluetooth LE: Services discovered");
        m_interface.OnServicesDiscovered(gatt, status);
    }

    public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        Log.i("Unity", "Bluetooth LE: Characteristic read: " + characteristic.getUuid().toString() + ": status = " + Integer.toString(status));
        m_interface.OnCharacteristicRead(gatt, characteristic, status);
    }

    public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
        //Log.i("Unity", "Bluetooth LE: Characteristic changed: " + characteristic.getUuid().toString());
        m_interface.OnCharacteristicChanged(gatt, characteristic);
    }

    public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
        Log.i("Unity", "Bluetooth LE: Descriptor write: " + descriptor.getUuid().toString() + ": status = " + Integer.toString(status));
        m_interface.OnDescriptorWrite(gatt, descriptor, status);
    }

    public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        Log.i("Unity", "Bluetooth LE: Characteristic write: " + characteristic.getUuid().toString() + ": status = " + Integer.toString(status));
        m_interface.OnCharacteristicWrite(gatt, characteristic, status);
    }

    public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
        Log.i("Unity", "Bluetooth LE: Connection status changed: " + Integer.toString(newState));
        m_interface.OnConnectionStateChange(gatt, status, newState);
    }
}