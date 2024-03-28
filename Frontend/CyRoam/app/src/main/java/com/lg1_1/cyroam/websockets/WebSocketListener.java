package com.lg1_1.cyroam.websockets;

/**
 * Listener that implements WebSocket Handling
 * @author Aidan Foss
 */
public interface WebSocketListener {
    void onPinRecieved(int id);


    void onfredReqRecieved(String name);
}
