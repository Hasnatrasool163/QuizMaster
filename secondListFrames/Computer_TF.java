package secondListFrames;

import frame.True_False_Questions;

public class Computer_TF extends True_False_Questions {

    public Computer_TF(String name) {
        super(name);
    }

// computer 49
    @Override
    public final void loadQuestions() {
        questions.add("The CPU (Central Processing Unit) is considered the brain of the computer.");
        answers.add("True");

        questions.add("RAM (Random Access Memory) is a type of permanent storage.");
        answers.add("False");

        questions.add("A solid-state drive (SSD) uses flash memory to store data.");
        answers.add("True");

        questions.add("The operating system manages hardware and software resources on a computer.");
        answers.add("True");

        questions.add("BIOS stands for Basic Input/Output System.");
        answers.add("True");

        questions.add("The GPU (Graphics Processing Unit) is primarily used for rendering graphics.");
        answers.add("True");

        questions.add("ROM (Read-Only Memory) is volatile memory that loses its data when the power is turned off.");
        answers.add("False");

        questions.add("A computer's motherboard houses the CPU, memory, and other essential components.");
        answers.add("True");

        questions.add("An Ethernet cable is used for wireless internet connections.");
        answers.add("False");

        questions.add("USB stands for Universal Serial Bus.");
        answers.add("True");

        questions.add("A byte consists of 16 bits.");
        answers.add("False");

        questions.add("Cache memory is faster than RAM.");
        answers.add("True");

        questions.add("The kernel is the core component of an operating system.");
        answers.add("True");

        questions.add("An IP address is a unique identifier assigned to each device connected to a network.");
        answers.add("True");

        questions.add("A router directs data packets between different networks.");
        answers.add("True");

        questions.add("Firmware is a type of software that is permanently programmed into hardware.");
        answers.add("True");

        questions.add("Virtual memory is a section of a hard drive that is used as if it were RAM.");
        answers.add("True");

        questions.add("A dual-core processor has two independent processors on a single chip.");
        answers.add("True");

        questions.add("The clock speed of a CPU is measured in gigahertz (GHz).");
        answers.add("True");

        questions.add("DNS stands for Domain Name System.");
        answers.add("True");

        questions.add("HTTP is a secure protocol used for transferring data over the internet.");
        answers.add("False");

        questions.add("A firewall can be hardware-based or software-based.");
        answers.add("True");

        questions.add("SSL (Secure Sockets Layer) is a standard technology for keeping internet connections secure.");
        answers.add("True");

        questions.add("The MAC address is a unique identifier assigned to a network interface card.");
        answers.add("True");

        questions.add("Multitasking in computing refers to running multiple applications simultaneously.");
        answers.add("True");

        questions.add("A hexadecimal number system uses a base of 10.");
        answers.add("False");

        questions.add("ASCII stands for American Standard Code for Information Interchange.");
        answers.add("True");

        questions.add("Cloud computing delivers computing services over the internet.");
        answers.add("True");

        questions.add("A compiler translates high-level programming code into machine code.");
        answers.add("True");

        questions.add("An interpreter executes programming code line by line.");
        answers.add("True");

        questions.add("An IP address is composed of four 8-bit numbers separated by periods.");
        answers.add("True");

        questions.add("SMTP is a protocol used for sending email.");
        answers.add("True");

        questions.add("A computer's BIOS is responsible for the initial boot process.");
        answers.add("True");

        questions.add("Virtualization allows multiple operating systems to run on a single physical machine.");
        answers.add("True");

        questions.add("The term 'boot' refers to starting up a computer from a powered-down state.");
        answers.add("True");

        questions.add("An SSD has no moving parts, unlike a traditional hard drive.");
        answers.add("True");

        questions.add("Data in a computer is represented using binary digits.");
        answers.add("True");

        questions.add("A file system manages how data is stored and retrieved on a disk.");
        answers.add("True");

        questions.add("An API (Application Programming Interface) allows different software applications to communicate with each other.");
        answers.add("True");

        questions.add("The primary function of the CPU is to execute instructions.");
        answers.add("True");

        questions.add("HTTPS is a secure version of HTTP.");
        answers.add("True");

        questions.add("A VPN (Virtual Private Network) provides a secure connection over a public network.");
        answers.add("True");

        questions.add("The data bus connects the CPU to memory and other devices.");
        answers.add("True");

        questions.add("Machine code is a low-level programming language understood by computers.");
        answers.add("True");

        questions.add("The term 'bit' is short for 'binary digit'.");
        answers.add("True");

        questions.add("A hard drive is an example of non-volatile storage.");
        answers.add("True");

        questions.add("The operating system's kernel remains in memory while the computer is running.");
        answers.add("True");

        questions.add("A database management system (DBMS) allows users to create, read, update, and delete data in a database.");
        answers.add("True");

        questions.add("An IP address can be either static or dynamic.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new Computer_TF(name).setVisible(true);
    }

}
