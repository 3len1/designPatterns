package bridge.utils;

import bridge.objects.Contact;
import bridge.objects.Message;
import bridge.objects.Signature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 3len1 on 3/11/2019.
 */
public class CrerationalUtils {
    private static String INITIATOR = "initiator";
    private static String RECEIVER = "receiver";


    public static Message createMessage() {
        Scanner scanner = new Scanner(System.in);
        Message message = new Message();
        System.out.println("Enter the subject:");
        message.setSubject(scanner.nextLine());

        System.out.println("Create initiator.");
        message.setSender(createContact(INITIATOR));
        System.out.println("Create initiator's signature.");
        message.setSignature(createSignature(message.getSender()));

        System.out.println("Enter the number of receivers.");
        int num = scanner.nextInt();
        scanner.nextLine();
        List<Contact> receivers = new ArrayList<>();
        for (int i = 0; i < num; i++)
            receivers.add(createContact(RECEIVER));
        message.setReceivers(receivers);

        System.out.println("Enter the message:");
        message.setBody(scanner.nextLine());

        return message;
    }

    public static Contact createContact(String word) {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("Enter " + word + " name:");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Enter " + word + " last name:");
        contact.setLastName(scanner.nextLine());
        System.out.println("Enter " + word + " email:");
        contact.setEmail(scanner.nextLine());
        System.out.println("Enter " + word + " phone:");
        contact.setPhoneNumber(scanner.nextLine());
        return contact;
    }

    public static Signature createSignature(Contact contact) {
        Scanner scanner = new Scanner(System.in);
        Signature signature = new Signature();
        System.out.println("Enter signature's tittle:");
        signature.setTitle(scanner.nextLine());
        signature.setContact(contact);
        return signature;
    }
}
