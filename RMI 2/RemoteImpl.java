import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements RemoteInterface {
    public RemoteImpl() throws RemoteException {
        // Constructor must throw RemoteException
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from the server!";
    }
}