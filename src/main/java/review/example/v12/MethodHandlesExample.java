package review.example.v12;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandlesExample {

    public static void main(String[] args) throws Throwable {
        /*
        For creating and using a MethodHandle, 4 steps are required:
        - Creating the lookup
        - Creating the method type
        - Finding the method handle
        - Invoking the method handle
        * */

        // Create an instance of GreetingService
        GreetingService service = new GreetingService();

        // Obtain a lookup object
        MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(GreetingService.class, MethodHandles.lookup());

        // Define the method type (return type and parameter types)
        MethodType methodType = MethodType.methodType(void.class, String.class);

        // Find the method handle for the sayHello method
        MethodHandle sayHelloHandle = lookup.findVirtual(GreetingService.class, "sayHello", methodType);
        MethodHandle sayByeHandle = lookup.findVirtual(GreetingService.class, "sayBye", methodType);

        // Invoke the method using the method handle
        sayHelloHandle.invokeExact(service, "Java graduate");
        sayByeHandle.invokeExact(service, "Java graduate");
    }
}

