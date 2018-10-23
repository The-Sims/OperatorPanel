package communication.messagegenerator;

import communication.websockets.IClientWebsocket;

public class MessageGenerator implements IMessageGenerator {

    private IClientWebsocket clientSocket;

    public MessageGenerator(IClientWebsocket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void sendKill(String playerId) {
        Object msg = new Object();
        clientSocket.send(msg);
    }
}
