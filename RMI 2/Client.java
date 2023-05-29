import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Get the remote object's stub from the registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            RemoteInterface remoteObj = (RemoteInterface) registry.lookup("RemoteObject");

            // Invoke remote method
            String result = remoteObj.sayHello();
            System.out.println("Server response: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}