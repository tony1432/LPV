import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    // Declare the methods that can be invoked remotely
    String sayHello() throws RemoteException;
}