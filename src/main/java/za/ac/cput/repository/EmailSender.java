package za.ac.cput.repository;


public interface EmailSender {
    void send(String to, String email);
}
