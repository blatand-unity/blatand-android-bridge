package com.blatand;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

public interface GattCallback
{
    public void OnServicesDiscovered(BluetoothGatt gatt, int status);

    public void OnCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status);

    public void OnCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic);

    public void OnCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status);

    public void OnDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status);

    public void OnConnectionStateChange(BluetoothGatt gatt, int status, int newState);

}