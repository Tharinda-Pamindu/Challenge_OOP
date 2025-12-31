package com.example.model;

public class Contact {

    /**
     * Contact class
     * Allow user to store their data
     * Including First Name, Last Name, Email, Phone number
     */
    private static int id = 0;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    /**
     * @Constructor
     * @Description Contact with first name, Last name, Email and Phone
     * @implNote
     * @param firstName required
     * @param lastName required
     * @param email required
     * @param phone required
     */
    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        id++;
    }

    /**
     * @implNote
     * @param firstName required
     * @param phone required
     */
    public Contact(String firstName, String phone) {
        this.firstName = firstName;
        this.phone = phone;
        this.email = "";
        this.lastName = "";
        id++;
    }

    /**
     *
     * @param firstName required
     * @param email required
     * @param phone required
     */
    public Contact(String firstName, String email, String phone) {
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.lastName = "";
        id++;
    }

    /**
     * Retrieve first name
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName required
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName required
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email required
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone required
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
