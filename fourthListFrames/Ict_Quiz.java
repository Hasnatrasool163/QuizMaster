package fourthListFrames;

/**
 * @author MuhammadHasnatRasool
 */
import frame.Quiz;


public class Ict_Quiz extends Quiz{
    

    public Ict_Quiz(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
    }
    
     private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }

   
    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }


    // questions:45
    @Override
    public final void loadQuestions() {
        questions.add("What does ICT stand for?");
        options.add("A) Information and Computer Technology, B) Internet and Communication Technology, C) Information and Communication Technology, D) Integrated Communication Technology");
        answers.add("C) Information and Communication Technology");

        questions.add("Which of the following is NOT a primary function of an operating system?");
        options.add("A) Managing hardware resources, B) Providing a user interface, C) Running applications, D) Performing arithmetic operations");
        answers.add("D) Performing arithmetic operations");

        questions.add("What is the main purpose of a firewall in ICT?");
        options.add("A) Protecting physical devices from damage, B) Preventing unauthorized access to or from private networks, C) Enhancing internet speed, D) Filtering spam emails");
        answers.add("B) Preventing unauthorized access to or from private networks");

        questions.add("Which programming language is commonly used for developing Android applications?");
        options.add("A) Java, B) C++, C) Python, D) Swift");
        answers.add("A) Java");

        questions.add("What does HTML stand for in the context of web development?");
        options.add("A) Hyperlinks and Text Markup Language, B) Hyper Text Markup Language, C) High Technical Markup Language, D) Hyper Terminal Markup Language");
        answers.add("B) Hyper Text Markup Language");

        questions.add("What is the function of a router in a computer network?");
        options.add("A) Providing power to devices, B) Managing files and folders, C) Connecting multiple networks together, D) Blocking unwanted websites");
        answers.add("C) Connecting multiple networks together");

        questions.add("In ICT, what does RAM stand for?");
        options.add("A) Read-Only Memory, B) Random Access Memory, C) Remote Access Management, D) Redundant Array of Memory");
        answers.add("B) Random Access Memory");

        questions.add("Which type of software allows users to create documents, spreadsheets, and presentations?");
        options.add("A) Database software, B) Multimedia software, C) Productivity software, D) Antivirus software");
        answers.add("C) Productivity software");

        questions.add("What is the purpose of an IP address in ICT?");
        options.add("A) To identify the location of a website, B) To encrypt files for secure transmission, C) To store data in cloud storage, D) To control access to the internet");
        answers.add("A) To identify the location of a website");

        questions.add("Which of the following is an example of cloud computing?");
        options.add("A) Sending emails using Outlook, B) Storing files on a local hard drive, C) Using Google Drive for online storage, D) Playing games offline");
        answers.add("C) Using Google Drive for online storage");

        questions.add("What is the role of a compiler in software development?");
        options.add("A) Translating high-level code into machine code, B) Debugging errors in code, C) Managing user interfaces, D) Optimizing database queries");
        answers.add("A) Translating high-level code into machine code");

        questions.add("Which type of software protects a computer system from malicious software?");
        options.add("A) Antivirus software, B) Office suites, C) Web browsers, D) Media players");
        answers.add("A) Antivirus software");

        questions.add("What is the function of a spreadsheet application in ICT?");
        options.add("A) Creating and editing images, B) Managing email accounts, C) Organizing data into rows and columns, D) Playing music files");
        answers.add("C) Organizing data into rows and columns");

        questions.add("Which protocol is commonly used for sending emails?");
        options.add("A) HTTP, B) FTP, C) SMTP, D) SNMP");
        answers.add("C) SMTP");

        questions.add("What does LAN stand for in the context of networking?");
        options.add("A) Local Area Network, B) Long Access Node, C) Logical Application Network, D) Limited Access Node");
        answers.add("A) Local Area Network");

        questions.add("Which type of software is used for creating and editing images?");
        options.add("A) Word processor, B) Graphic design software, C) Antivirus software, D) Database management system");
        answers.add("B) Graphic design software");

        questions.add("What is the purpose of a URL?");
        options.add("A) To identify a specific web page, B) To manage user accounts, C) To store large amounts of data, D) To execute commands in a terminal");
        answers.add("A) To identify a specific web page");

        questions.add("Which programming language is used for creating dynamic web pages?");
        options.add("A) HTML, B) CSS, C) JavaScript, D) SQL");
        answers.add("C) JavaScript");

        questions.add("What is the role of a DNS server in ICT?");
        options.add("A) Managing file permissions, B) Translating domain names into IP addresses, C) Scanning for viruses, D) Creating website layouts");
        answers.add("B) Translating domain names into IP addresses");

        questions.add("In ICT, what does VPN stand for?");
        options.add("A) Virtual Private Network, B) Very Personal Network, C) Verified Private Network, D) Virtual Public Network");
        answers.add("A) Virtual Private Network");

        questions.add("Which component of a computer system performs arithmetic and logical operations?");
        options.add("A) CPU, B) RAM, C) Hard drive, D) Monitor");
        answers.add("A) CPU");

        questions.add("What is the purpose of encryption in ICT?");
        options.add("A) To speed up internet connections, B) To store large amounts of data, C) To protect data from unauthorized access, D) To create virtual machines");
        answers.add("C) To protect data from unauthorized access");

        questions.add("Which programming language is commonly used for database management?");
        options.add("A) Java, B) PHP, C) SQL, D) Ruby");
        answers.add("C) SQL");

        questions.add("What is the function of a modem in ICT?");
        options.add("A) Managing software updates, B) Converting digital signals to analog signals for transmission over telephone lines, C) Protecting against malware, D) Creating backups");
        answers.add("B) Converting digital signals to analog signals for transmission over telephone lines");

        questions.add("Which type of software allows users to browse the internet?");
        options.add("A) Operating system, B) Web browser, C) Database software, D) Video editing software");
        answers.add("B) Web browser");

        questions.add("What does CPU stand for in ICT?");
        options.add("A) Central Processing Unit, B) Computer Programming Utility, C) Core Processing Unit, D) Central Programming Unit");
        answers.add("A) Central Processing Unit");

        questions.add("Which type of network connects computers within a limited geographical area?");
        options.add("A) LAN, B) WAN, C) MAN, D) WLAN");
        answers.add("A) LAN");

        questions.add("What does FTP stand for in the context of file transfer?");
        options.add("A) File Transfer Protocol, B) Fast Transfer Process, C) File Transport Process, D) Fast Transmission Protocol");
        answers.add("A) File Transfer Protocol");

        questions.add("Which component of a computer system stores data and programs permanently?");
        options.add("A) RAM, B) CPU, C) Hard drive, D) Optical drive");
        answers.add("C) Hard drive");

        questions.add("What is the purpose of a cache memory in a computer system?");
        options.add("A) Storing frequently used data for quick access, B) Connecting to external devices, C) Managing network traffic, D) Displaying graphics on screen");
        answers.add("A) Storing frequently used data for quick access");

        questions.add("Which type of software allows users to create and manage databases?");
        options.add("A) Web browser, B) Database management system, C) Media player, D) Firewall");
        answers.add("B) Database management system");

        questions.add("What is the function of an email client software?");
        options.add("A) Creating graphics, B) Browsing websites, C) Sending and receiving emails, D) Playing music");
        answers.add("C) Sending and receiving emails");

        questions.add("Which protocol is used for secure communication over a computer network?");
        options.add("A) FTP, B) HTTP, C) HTTPS, D) SMTP");
        answers.add("C) HTTPS");

        questions.add("What is the role of an assembler in software development?");
        options.add("A) Translating high-level code into machine code, B) Debugging errors in code, C) Managing user interfaces, D) Optimizing database queries");
        answers.add("A) Translating high-level code into machine code");

        questions.add("Which type of software is used for protecting a computer system from unauthorized access?");
        options.add("A) Firewall software, B) Database software, C) Spreadsheet software, D) Presentation software");
        answers.add("A) Firewall software");

        questions.add("What is the purpose of a virtual machine in ICT?");
        options.add("A) Storing files in the cloud, B) Running multiple operating systems on a single physical machine, C) Protecting against phishing attacks, D) Analyzing network traffic");
        answers.add("B) Running multiple operating systems on a single physical machine");

        questions.add("Which programming language is commonly used for scientific computing and data analysis?");
        options.add("A) Python, B) Java, C) C++, D) PHP");
        answers.add("A) Python");

        questions.add("What is the function of an input device in a computer system?");
        options.add("A) Displaying output on the screen, B) Storing data permanently, C) Sending data to other computers, D) Entering data into the computer");
        answers.add("D) Entering data into the computer");
        
        questions.add("What does LAN stand for in networking?");
        options.add("A) Local Area Network, B) Long Area Network, C) Large Area Network, D) Limited Access Network");
        answers.add("A) Local Area Network");
        
        questions.add("What is the function of a compiler in programming?");
        options.add("A) Converts source code into machine code, B) Executes the program, C) Edits the program, D) Stores the program");
        answers.add("A) Converts source code into machine code");
        
        questions.add("Which component of a computer system handles data input and output?");
        options.add("A) RAM, B) Hard disk, C) CPU, D) I/O devices");
        answers.add("D) I/O devices");
        
        questions.add("Which of the following is used to store large amounts of data permanently?");
        options.add("A) RAM, B) Cache memory, C) Hard disk drive, D) CPU");
        answers.add("C) Hard disk drive");

        questions.add("What is the function of an operating system?");
        options.add("A) Manage computer hardware and software resources, B) Execute application programs, C) Create documents and presentations, D) Control the internet");
        answers.add("A) Manage computer hardware and software resources");
        
        questions.add("Which programming language is widely used for building Android applications?");
        options.add("A) Swift, B) Python, C) Java, D) C++");
        answers.add("C) Java");
        
        questions.add("Which type of software helps manage hardware components and provides basic functionalities?");
        options.add("A) Application software, B) Utility software, C) System software, D) Network software");
        answers.add("C) System software");
     

    }
    

    public static void main(String[]args){
        new Ict_Quiz(name).setVisible(true);
    }
    
}
