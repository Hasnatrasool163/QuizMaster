package fourthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class CyberSecurity_Quiz extends Quiz{
    

    public CyberSecurity_Quiz(String name) {
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

    // questions:  130

    @Override
    public final void loadQuestions() {
  
        questions.add("According to the shared responsibility model, which cloud computing model places the most responsibility on the cloud service provider (CSP)?");
        options.add("A) Hybrid Cloud, B) Software as a Service (SaaS), C) Platform as a Service (PaaS), D) Infrastructure as a Service (IaaS)");
        answers.add("B) Software as a Service (SaaS)");

        questions.add("Which option removes the risk of multitenancy in cloud computing?");
        options.add("A) PaaS, B) public cloud, C) private cloud, D) IaaS");
        answers.add("C) private cloud");

        questions.add("Your organization recently implemented a unified messaging solution and VoIP phones on every desktop. You are responsible for researching the vulnerabilities of the VoIP system. Which type of attack are VoIP phones most vulnerable to experiencing?");
        options.add("A) denial-of-service, B) brute force attacks, C) malware, D) buffer overflow");
        answers.add("A) denial-of-service");

        questions.add("Which security control cannot produce an active response to a security event?");
        options.add("A) cloud access security broker (CASB), B) intrusion prevention system (IPS), C) intrusion detection system (IDS), D) next generation firewall");
        answers.add("C) intrusion detection system (IDS)");

        questions.add("Packet sniffer is also called ___?");
        options.add("A) SIEM, B) UTM, C) protocol analyzer, D) data sink");
        answers.add("C) protocol analyzer");

        questions.add("Which option tests code while it is in operation?");
        options.add("A) code review, B) code analysis, C) static analysis, D) dynamic analysis");
        answers.add("D) dynamic analysis");

        questions.add("Which option describes testing that individual software developers can conduct on their own code?");
        options.add("A) gray box testing, B) integration testing, C) white box testing, D) unit testing");
        answers.add("D) unit testing");

        questions.add("In black box penetration testing, what information is provided to the tester about the target environment?");
        options.add("A) none, B) limited details of server and network infrastructure, C) all information, D) limited details of server infrastructure");
        answers.add("A) none");

        questions.add("Which security control can best protect against shadow IT by identifying and preventing use of unsanctioned cloud apps and services?");
        options.add("A) intrusion prevention system (IPS), B) next generation firewall, C) cloud access security broker (CASB), D) intrusion detection system (IDS)");
        answers.add("C) cloud access security broker (CASB)");

        questions.add("Which option describes the best defense against collusion?");
        options.add("A) monitoring of normal employee system and data access patterns, B) applying system and application updates regularly, C) fault tolerant infrastructure and data redundancy, D) separation of duties and job rotation");
        answers.add("D) separation of duties and job rotation");

        questions.add("During a penetration test, you find a file containing hashed passwords for the system you are attempting to breach. Which type of attack is most likely to succeed in accessing the hashed passwords in a reasonable amount of time?");
        options.add("A) rainbow table attack, B) pass-the-hash attack, C) password spray attack, D) brute force attack");
        answers.add("A) rainbow table attack");

        questions.add("Which area is DMZ?");
        options.add("A) 4, B) 1, C) 2, D) 3");
        answers.add("C) 2");

        questions.add("You configure an encrypted USB drive for a user who needs to deliver a sensitive file at an in-person meeting. What type of encryption is typically used to encrypt the file?");
        options.add("A) file hash, B) asymmetric encryption, C) digital signature, D) symmetric encryption");
        answers.add("D) symmetric encryption");

        questions.add("What is the difference between DRP and BCP?");
        options.add("A) DRP works to keep a business up and running despite a disaster. BCP works to restore the original business capabilities., B) BCP works to keep a business up and running despite a disaster. DRP works to restore the original business capabilities., C) BCP is part of DRP., D) DRP is part of BCP.");
        answers.add("A) DRP works to keep a business up and running despite a disaster. BCP works to restore the original business capabilities.");

        questions.add("Which aspect of cybersecurity do Distributed Denial of Service (DDoS) attacks affect the most?");
        options.add("A) non-repudiation, B) integrity, C) availability, D) confidentiality");
        answers.add("C) availability");
        
        questions.add("You need to recommend a solution to automatically assess your cloud-hosted VMs against CIS benchmarks to identify deviations from security best practices. What type of solution should you recommend?");
        options.add("A) Cloud Security Posture Management (CSPM), B) Intrusion Detection and Prevention System (IDPS), C) Cloud Workload Protection Platforms (CWPP), D) Cloud Access Security Brokers (CASBs)");
        answers.add("A) Cloud Security Posture Management (CSPM)");

        questions.add("_ validates the integrity of data files.");
        options.add("A) Compression, B) Hashing, C) Symmetric encryption, D) Stenography");
        answers.add("B) Hashing");

        questions.add("Which is an example of privacy regulation at the state government level in the U.S.?");
        options.add("A) CCPA, B) GDPR, C) NIST Privacy Framework, D) OSPF");
        answers.add("A) CCPA");

        questions.add("What is the term for the policies and technologies implemented to protect, limit, monitor, audit, and govern identities with access to sensitive data and resources?");
        options.add("A) identity and access management (IAM), B) privileged account management (PAM), C) authentication and authorization, D) least privilege");
        answers.add("A) identity and access management (IAM)");

        questions.add("You have configured audit settings in your organization's cloud services in the event of a security incident. What type of security control is an audit trail?");
        options.add("A) preventive control, B) detective control, C) directive control, D) corrective control");
        answers.add("B) detective control");

        questions.add("What is the name for a short-term interruption in electrical power supply?");
        options.add("A) grayout, B) blackout, C) brownout, D) whiteout");
        answers.add("B) blackout");

        questions.add("Your security team recommends adding a layer of defense against emerging persistent threats and zero-day exploits for all endpoints on your network. The solution should offer protection from external threats for network-connected devices, regardless of operating system. Which solution is best suited to meet this requirement?");
        options.add("A) Security Information Event Management (SIEM), B) Extended Detection and Response (XDR), C) next generation firewall (NGFW), D) Cloud App Security Broker (CASB)");
        answers.add("C) next generation firewall (NGFW)");

        questions.add("Which is not a threat modeling methodology?");
        options.add("A) TRIKE, B) TOGAF, C) STRIDE, D) MITRE ATT&CK");
        answers.add("B) TOGAF");

        questions.add("You organization is conducting a pilot deployment of a new e-commerce application being considered for purchase. You need to recommend a strategy to evaluate the security of the new software. Your organization does not have access to the application's source code. Which strategy should you choose?");
        options.add("A) dynamic application security testing, B) unit testing, C) white box testing, D) static application security testing");
        answers.add("A) dynamic application security testing");

        questions.add("You need to disable the camera on corporate devices to prevent screen capture and recording of sensitive documents, meetings, and conversations. Which solution would be best suited to the task?");
        options.add("A) Mobile Device Management (MDM), B) Data Loss Prevention (DLP), C) Intrusion Detection and Prevention System (IDPS), D) Cloud Access Security Broker (CASB)");
        answers.add("A) Mobile Device Management (MDM)");

        questions.add("How many keys would be necessary to accommodate 100 users in an asymmetric cryptography system?");
        options.add("A) 200, B) 400, C) 100, D) 300");
        answers.add("A) 200");

        questions.add("Two competing online retailers process credit card transactions for customers in countries on every continent. One organization is based in the United States. The other is based in the Netherlands. With which regulation must both countries comply while ensuring the security of these transactions?");
        options.add("A) Federal Information Security Management Act (FISMA), B) Payment Card Industry Data Security Standard (PCI-DSS), C) General Data Protection Regulation (GDPR), D) International Organization for Standardization and International Electrotechnical Commission (ISO/IEC 27018)");
        answers.add("B) Payment Card Industry Data Security Standard (PCI-DSS)");

        questions.add("What provides a common language for describing security incidents in a structured and repeatable manner?");
        options.add("A) Common event format, B) common weakness enumeration, C) common vulnerabilities and exposures, D) common vulnerability scoring system");
        answers.add("C) common vulnerabilities and exposures");

        questions.add("Which type of application can intercept sensitive information such as passwords on a network segment?");
        options.add("A) log server, B) network scanner, C) firewall, D) protocol analyzer");
        answers.add("D) protocol analyzer");

        questions.add("An attacker has discovered that they can deduce a sensitive piece of confidential information by analyzing multiple pieces of less sensitive public data. What type of security issue exists?");
        options.add("A) aggregation, B) inference, C) SQL injection, D) cross-origin resource sharing");
        answers.add("B) inference");

        questions.add("What act grants an authenticated party permission to perform an action or access a resource?");
        options.add("A) Zero Trust Security, B) Role-Based Access Control (RBAC), C) authorization, D) Single Sign-On");
        answers.add("C) authorization");

        questions.add("According to GDPR, a data _ is the person about whom data is being collected.");
        options.add("A) processor, B) object, C) subject, D) controller");
        answers.add("C) subject");

        questions.add("Which is not a principle of zero trust security?");
        options.add("A) use least privilege access, B) verify explicitly, C) trust but verify, D) assume breach");
        answers.add("C) trust but verify");

        questions.add("Which attack exploits input validation vulnerabilities?");
        options.add("A) ARP spoofing, B) pharming attacks, C) cross-site scripting (XSS), D) DNS poisoning");
        answers.add("C) cross-site scripting (XSS)");

        questions.add("You are a security analyst, and you receive a text message alerting you of a possible attack. Which security control is the _ least _ likely to produce this type of alert?");
        options.add("A) IDS, B) SIEM, C) packet sniffer, D) IPS");
        answers.add("C) packet sniffer");

        questions.add("SQL injection inserts a code fragment that makes a database statement universally true, like _.");
        options.add("A) SELECT * FROM users WHERE username = \" AND 1=1--', B) SELECT * FROM users WHERE username = \" AND 1!=1--', C) SELECT * FROM users WHERE username = \" OR 1=1--', D) SELECT * FROM users WHERE username = \" OR 1!=1--'");
        answers.add("C) SELECT * FROM users WHERE username = \" OR 1=1--'");

        questions.add("Which type of security assessment requires access to source code?");
        options.add("A) static analysis, B) black box testing, C) dynamic analysis, D) penetration testing");
        answers.add("A) static analysis");

        questions.add("Which option is an open-source solution to scanning a network for active hosts and open ports?");
        options.add("A) Autopsy, B) Snort, C) Nmap, D) Wireshark");
        answers.add("C) Nmap");

        questions.add("When implementing a data loss prevention (DLP) strategy, what is the first step in the process?");
        options.add("A) Evaluate the features of available DLP products to determine which best meet your organization's needs., B) Examine the flow of sensitive data in your organization to better understand usage patterns., C) Conduct an inventory of all the data in your organization to establish classifications based on sensitivity., D) Conduct a risk assessment to determine the best data labeling strategy for your organization.");
        answers.add("A) Evaluate the features of available DLP products to determine which best meet your organization's needs.");

        questions.add("Which malware changes an operating system and conceals its tracks?");
        options.add("A) virus, B) worm, C) rootkit, D) Trojan horse");
        answers.add("C) rootkit");
        
        questions.add("Virtual Private Networks (VPNs) use to create a secure connection between two networks.");
        options.add("A) encryption, B) a metropolitan area network, C) a virtual local area network, D) a wide area network");
        answers.add("A) encryption");

        questions.add("What is the process of challenging a user to prove their identity?");
        options.add("A) authentication, B) Single Sign-On, C) authorization, D) Role-Based Access Control (RBAC)");
        answers.add("A) authentication");

        questions.add("Which cyberattack aims to exhaust an application's resources, making the application unavailable to legitimate users?");
        options.add("A) SQL injection, B) dictionary attack, C) Distributed Denial of Service (DDoS), D) rainbow table attack");
        answers.add("C) Distributed Denial of Service (DDoS)");

        questions.add("You are a recent cybersecurity hire, and your first assignment is to present on the possible threats to your organization. Which of the following best describes the task?");
        options.add("A) risk mitigation, B) threat assessment, C) risk management, D) enumeration");
        answers.add("C) risk management");

        questions.add("You are at a coffee shop and connect to a public wireless access point (WAP). What type of cybersecurity attack are you most likely to experience?");
        options.add("A) man-in-the-middle attack, B) back door, C) logic bomb, D) virus");
        answers.add("A) man-in-the-middle attack");

        questions.add("You have been tasked with recommending a solution to centrally manage mobile devices used throughout your organization. Which technology would best meet this need?");
        options.add("A) Extended Detection and Response (XDR), B) Security Information Event Management (SIEM), C) Intrusion Detection and Prevention System (IDPS), D) Mobile Device Management (MDM)");
        answers.add("D) Mobile Device Management (MDM)");

        questions.add("Which type of vulnerability cannot be discovered in the course of a typical vulnerability assessment?");
        options.add("A) file permissions, B) buffer overflow, C) zero-day vulnerability, D) cross-site scripting");
        answers.add("C) zero-day vulnerability");

        questions.add("The DLP project team is about to classify your organization's data. What is the primary purpose of classifying data?");
        options.add("A) It identifies regulatory compliance requirements., B) It prioritizes IT budget expenditures., C) It quantifies the potential cost of a data breach., D) It establishes the value of data to the organization.");
        answers.add("D) It establishes the value of data to the organization.");

        questions.add("You are responsible for managing security of your organization's public cloud infrastructure. You need to implement security to protect the data and applications running in a variety of IaaS and PaaS services, including a new Kubernetes cluster. What type of solution is best suited to this requirement?");
        options.add("A) Cloud Workload Protection Platforms (CWPP), B) Cloud Security Posture Management (CSPM), C) Cloud Access Security Brokers (CASBs), D) Intrusion Detection and Prevention System (IDPS)");
        answers.add("A) Cloud Workload Protection Platforms (CWPP)");

        questions.add("Sharing account credentials violates the ___ aspect of access control.");
        options.add("A) identification, B) authorization, C) accounting, D) authentication");
        answers.add("D) authentication");

        questions.add("You have recovered a server that was compromised in a malware attack to its previous state. What is the final step in the incident response process?");
        options.add("A) Eradication / Remediation, B) Certification, C) Reporting, D) Lessons Learned");
        answers.add("D) Lessons Learned");

        questions.add("Which encryption type uses a public and private key pair for encrypting and decrypting data?");
        options.add("A) asymmetric, B) symmetric, C) hashing, D) all of these answers");
        answers.add("A) asymmetric");

        questions.add("You have just identified and mitigated an active malware attack on a user's computer, in which command and control was established. What is the next step in the process?");
        options.add("A) Reporting, B) Recovery, C) Eradication / Remediation, D) Lessons Learned");
        answers.add("C) Eradication / Remediation");

        questions.add("Which programming language is most susceptible to buffer overflow attacks?");
        options.add("A) C, B) Java, C) Ruby, D) Python");
        answers.add("A) C");

        questions.add("Which list correctly describes risk management techniques?");
        options.add("A) risk acceptance, risk mitigation, risk containment, and risk qualification, B) risk avoidance, risk transference, risk containment, and risk quantification, C) risk avoidance, risk mitigation, risk containment, and risk acceptance, D) risk avoidance, risk transference, risk mitigation, and risk acceptance");
        answers.add("D) risk avoidance, risk transference, risk mitigation, and risk acceptance");

        questions.add("To implement encryption in transit, such as with the HTTPS protocol for secure web browsing, which type(s) of encryption is/are used?");
        options.add("A) asymmetric, B) both symmetric and asymmetric, C) neither symmetric or asymmetric, D) symmetric");
        answers.add("B) both symmetric and asymmetric");

        questions.add("Which type of program uses Windows Hooks to capture keystrokes typed by the user, hides in the process list, and can compromise their system as well as their online access codes and password?");
        options.add("A) trojan, B) keystroke collector, C) typethief, D) keylogger");
        answers.add("D) keylogger");

        questions.add("How does ransomware affect a victim's files?");
        options.add("A) by destroying them, B) by encrypting them, C) by stealing them, D) by selling them");
        answers.add("B) by encrypting them");

        questions.add("Your computer has been infected, and is sending out traffic to a targeted system upon receiving a command from a botmaster. What condition is your computer currently in?");
        options.add("A) It has become a money mule., B) It has become a zombie., C) It has become a bastion host., D) It has become a botnet.");
        answers.add("B) It has become a zombie.");

        questions.add("You choose a cybersecurity framework for your financial organization that implements an effective and auditable set of governance and management processes for IT. Which framework are you choosing?");
        options.add("A) C2M2, B) NIST SP 800-37, C) ISO/IEC 27001, D) COBIT");
        answers.add("B) NIST SP 800-37");

        questions.add("NIST issued a revision to SP 800-37 in December 2018. It provides a disciplined, structured, and flexible process for managing security and privacy risk. Which type of document is SP 800-37?");
        options.add("A) a risk management framework, B) a guide to risk assessments, C) a guideline for vulnerability testing, D) a step-by-step guide for performing business impact analyses");
        answers.add("A) a risk management framework");

        questions.add("The most notorious military-grade advanced persistent threat was deployed in 2010, and targeted centrifuges in Iran. What was this APT called?");
        options.add("A) duqu, B) agent BTZ, C) stuxnet, D) flame");
        answers.add("C) stuxnet");

        questions.add("Where would you record risks that have been identified and their details, such as their ID and name, classification of information, and the risk owner?");
        options.add("A) in the risk assessment documentation, B) in the risk register, C) in the business impact ledger, D) in the Orange Book");
        answers.add("B) in the risk register");

        questions.add("To prevent an incident from overwhelming resources _____ is necessary.");
        options.add("A) disconnection from the network, B) early containment, C) continuation of monitoring for other incidents, D) eradication of the issues");
        answers.add("B) early containment");

        questions.add("FUD is expensive and often causes high drama over low risk. Which computer chip exploits were reported by CNN as needing to be completely replaced, but were later fixed with firmware updates?");
        options.add("A) fire and ice exploits, B) meltdown and spectre exploits, C) Intel and STMicro CPU exploits, D) super microboard and Apple iPhone exploits");
        answers.add("B) meltdown and spectre exploits");

        questions.add("The ASD Top Four are application whitelisting, patching of applications, patching of operating systems, and limiting administrative privileges. What percent of breaches do these account for?");
        options.add("A) 40 percent, B) 60 percent, C) 85 percent, D) 100 percent");
        answers.add("C) 85 percent");

        questions.add("You are working in the security operations center analyzing traffic on your network. You detect what you believe to be a port scan. What does this mean?");
        options.add("A) This could be a specific program being run by your accounting department., B) This is an in-progress attack and should be reported immediately, C) This is normal operation for your business., D) This could be a precursor to an attack.");
        answers.add("D) This could be a precursor to an attack.");

        questions.add("How often is the ISF Standard of Good Practice updated?");
        options.add("A) annual, B) biannually, C) bimonthly, D) monthly");
        answers.add("A) annual");

        questions.add("Your incident response team is unable to contain an incident because they lack authority to take action without management approval. Which critical step in the preparation phase did your team skip?");
        options.add("A) From an incident response committee to oversee any incidents that may occur., B) Get preauthorized to take unilateral action and make or direct emergency changes., C) Bring management in as leadership on the incident response team., D) Assign a head of the emergency response team who has the correct authority");
        answers.add("B) Get preauthorized to take unilateral action and make or direct emergency changes.");

        questions.add("NIST SP 800-53 is one of two important control frameworks used in cybersecurity. What is the other one?");
        options.add("A) ISO 27001, B) NIST SP 800-54, C) ISO 27002, D) NIST SP 751-51");
        answers.add("C) ISO 27002");
        
        questions.add("Which organization, established by NIST in 1990, runs workshops to foster coordination in incident prevention, stimulate rapid reaction to incidents, and allow experts to share information?");
        options.add("a. Forum of Incident Response and Security Teams, b. Crest UK Response Teams, c. Community of Computer Incident Response Teams, d. NIST Special Publication 800-61 Response Teams");
        answers.add("a. Forum of Incident Response and Security Teams");

        questions.add("You have implemented controls to mitigate the threats, vulnerabilities, and impact to your business. Which type of risk is left over?");
        options.add("a. inherent risk, b. residual risk, c. applied risk, d. leftover risk");
        answers.add("b. residual risk");

        questions.add("There are four possible treatments once an assessment has identified a risk. Which risk treatment implements controls to reduce risk?");
        options.add("a. risk mitigation, b. risk acceptance, c. risk avoidance, d. risk transfer");
        answers.add("a. risk mitigation");

        questions.add("Which security control scheme do vendors often submit their products to for evaluation, to provide an independent view of product assurance?");
        options.add("a. Common Criteria, b. risk management certification board, c. OWASP security evaluation, d. ISO 27000");
        answers.add("a. Common Criteria");

        questions.add("Which organization has published the most comprehensive set of controls in its security guideline for the Internet of Things?");
        options.add("a. IoT ISACA, b. IoT Security Foundation, c. OWASP, d. GSMA");
        answers.add("b. IoT Security Foundation");

        questions.add("Which main reference coupled with the Cloud Security Alliance Guidance comprise the Security Guidance for Critical Areas of Focus in Cloud Computing?");
        options.add("a. ISO 27001, b. ISO 27017, c. Cloud Security Guidelines, d. Cloud Controls Matrix");
        answers.add("d. Cloud Controls Matrix");

        questions.add("What are the essential characteristics of the reference monitor?");
        options.add("a. It is versatile, accurate, and operates at a very high speed., b. It is tamper-proof, can always be invoked, and must be small enough to test., c. It is restricted, confidential, and top secret");
        answers.add("b. It is tamper-proof, can always be invoked, and must be small enough to test.");

        questions.add("According to NIST, what is the first action required to take advantage of the cybersecurity framework?");
        options.add("a. Identify the key business outcomes., b. Understand the threats and vulnerabilities., c. Conduct a risk assessment., d. Analyze and prioritize gaps to create the action plan.");
        answers.add("a. Identify the key business outcomes.");

        questions.add("You are implementing a cybersecurity program in your organization and want to use the 'de facto standard' cybersecurity framework. Which option would you choose?");
        options.add("a. the ISACA Cybersecurity Framework, b. the COBIT Cybersecurity Framework, c. the ISC2 Cybersecurity Framework, d. the NIST Cybersecurity Framework");
        answers.add("d. the NIST Cybersecurity Framework");

        questions.add("In 2014, 4,278 IP addresses of zombie computers were used to flood a business with over one million packets per minute for about one hour. What is this type of attack called?");
        options.add("a. a salami attack, b. a DoS (Denial of Service) attack, c. a DDoS (Distributed Denial of Service) attack, d. a botnet attack");
        answers.add("c. a DDoS (Distributed Denial of Service) attack");

        questions.add("The regulatory requirements for notifications of data breaches, particularly the European General Data Protection Regulations, have had what sort of effect on business?");
        options.add("a. an increased business liability in the event of a data breach, b. an increased consumer liability in the event of a data breach, c. a decreased consumer liability in the event of a data breach, d. a decreased business liability in the event of a data breach");
        answers.add("a. an increased business liability in the event of a data breach");

        questions.add("Which compliance framework governs requirements for the U.S. healthcare industry?");
        options.add("a. FedRAMP, b. GDPR, c. PCI-DSS, d. HIPAA");
        answers.add("d. HIPAA");

        questions.add("What is the difference between DevOps and DevSecOps?");
        options.add("a. DevSecOps requires the inclusion of cybersecurity engineers in the CI/CD process of DevOps., b. DevSecOps slows down the CI/CD process of DevOps., c. DevSecOps places security controls in the CI/CD process of DevOps., d. DevSecOps lets cybersecurity engineers dictate the CI/CD process of DevOps.");
        answers.add("a. DevSecOps requires the inclusion of cybersecurity engineers in the CI/CD process of DevOps.");

        questions.add("When does static application security testing require access to source code?");
        options.add("a. always, b. only when assessing regulatory compliance, c. only if following the Agile model, d. never");
        answers.add("a. always");

        questions.add("Your organization services customer orders with a custom ordering system developed in-house. You are responsible for recommending a cloud model to meet the following requirements:\n\nControl of security required for regulatory compliance\nLegacy application and database support\nScalability to meet seasonal increases in demand\n\nWhich cloud model is the best option for these requirements?");
        options.add("a. government cloud, b. public cloud, c. hybrid cloud, d. private cloud");
        answers.add("c. hybrid cloud");

        questions.add("You have just conducted a port scan of a network. There is no well-known port active. How do you find a webserver running on a host, which uses a random port number?");
        options.add("a. Give up on the current target network and move on to the next one., b. Switch to another network scanning tool. Resort to more resource-intensive probing, like launching random attacks to all open ports., c. Turn on the stealth mode in your network scanning tool. Check whether you missed any other active ports associated with web servers., d. Turn on additional options in your network scanning tool to further investigate the details (type and version) of applications running on the rest of the active ports.");
        answers.add("d. Turn on additional options in your network scanning tool to further investigate the details (type and version) of applications running on the rest of the active ports.");

        questions.add("Executives in your organization exchange emails with external business partners when negotiating valuable business contracts. To ensure that these communications are legally defensible, the security team has recommended that a digital signature be added to these message.\n\nWhat are the primary goals of the digital signature in this scenario? (Choose the best answer.)");
        options.add("a. integrity and non-repudiation, b. privacy and non-repudiation, c. privacy and confidentiality, d. integrity and privacy");
        answers.add("a. integrity and non-repudiation");
        
        questions.add("Which option is a mechanism to ensure non-repudiation?");
        options.add("A) MD5, B) Caesar cipher, C) symmetric-key encryption, D) asymmetric-key encryption");
        answers.add("D) asymmetric-key encryption");

        questions.add("Which software development lifecycle approach is most compatible with DevSecOps?");
        options.add("A) Agile, B) Model-Driven Development, C) Waterfall, D) Model-Driven Architecture");
        answers.add("A) Agile");

        questions.add("Which information security principle states that organizations should defend systems against any particular attack using several independent methods?");
        options.add("A) separation of duties, B) privileged account management (PAM), C) defense-in-depth, D) least privilege");
        answers.add("C) defense-in-depth");

        questions.add("Which option describes a core principle of DevSecOps?");
        options.add("A) Testing and release should be 100% automated, B) Role separation is the key to software security, C) Final responsibility for security rests with the architect of the application, D) Everyone in the process is responsible for security");
        answers.add("D) Everyone in the process is responsible for security");

        questions.add("You need to implement a solution to protect internet-facing applications from common attacks like XSS, CSRF, and SQL injection. Which option is best suited to the task?");
        options.add("A) Security Information Event Management (SIEM), B) an Instruction Detection and Prevention System (IDPS) appliance, C) a web application firewall (WAF), D) a stateful packet inspection firewall");
        answers.add("C) a web application firewall (WAF)");

        questions.add("Which phase of the incident response process happens immediately following identification?");
        options.add("A) Eradication / Remediation, B) Reporting, C) Containment / Mitigation, D) Recovery");
        answers.add("B) Reporting");

        questions.add("How can a data retention policy reduce your organization's legal liability?");
        options.add("A) by reducing DLP licensing costs, B) by ensuring that data is not retained beyond its necessary retention date, C) by destroying data that may implicate company executives in dishonest behavior, D) by reducing cost associated with data storage and protection");
        answers.add("B) by ensuring that data is not retained beyond its necessary retention date");

        questions.add("You believe a recent service outage due to a denial-of-service attack from a disgruntled inside source. What is the name for the malicious act this employee has committed?");
        options.add("A) espionage, B) sabotage, C) fraud, D) confidentiality breach");
        answers.add("B) sabotage");

        questions.add("Which option is a framework widely utilized by organizations in the development of security governance standards?");
        options.add("A) Software Capability Maturity Model (SW-CMM), B) Control Objectives for Information and Related Technologies (COBIT), C) The Open Group Architecture Framework (TOGAF), D) Software Development Life Cycle (SDLC)");
        answers.add("B) Control Objectives for Information and Related Technologies (COBIT)");

        questions.add("There are connection-oriented and connectionless protocols in networking. What do web browsers use to ensure the integrity of the data it sends and receives?");
        options.add("A) UDP that is connection-oriented, B) TCP that is connection-oriented, C) UDP that is connectionless, D) TCP that is connectionless");
        answers.add("B) TCP that is connection-oriented");

        questions.add("Which type of attack targets vulnerabilities associated with translating MAC addresses into IP addresses in computer networking?");
        options.add("A) DNS poisoning, B) CRL trapping, C) ARP spoofing, D) DDoS");
        answers.add("C) ARP spoofing");

        questions.add("You are part of an incident response team at your company. While sifting through log files collected by a SIEM, you discover some suspicious log entries that you want to investigate further. Which type of the following best refers to those recorded activities demanding additional scrutiny?");
        options.add("A) attack, B) information, C) threat, D) event");
        answers.add("D) event");
        
        questions.add("You are responsible for forensic investigations in your organization. You have been tasked with investigating a compromised virtual application server. Because a revenue-generating application runs on the server, the server needs to be returned to service as quickly as possible. What is the next step you should take to best fulfill your responsibilities and meet the needs of the business?");
        options.add("A) Restore the server from backup immediately, B) Take the server offline until your investigation is complete, C) Take a snapshot of the compromised virtual server for your investigation, D) Restart the server. Remediate the issue after business hours");
        answers.add("C) Take a snapshot of the compromised virtual server for your investigation");
        
        questions.add("What is a portion of a document in which you set certain formatting options?");
        options.add("A) Paragraph, B) Document, C) Section, D) Setup");
        answers.add("A) Paragraph");

        questions.add("Which organization should you reference as an authoritative source for information on web-based attack vectors?");
        options.add("A) EC-Council, B) ISACA, C) NIST, D) OWASP");
        answers.add("D) OWASP");

        questions.add("Which action is most likely to simplify security staff training, improve integration between security components, and reduce risk to the business?");
        options.add("A) adopting a 'best-in-suite' approach to security, B) adopting a 'trust but verify' approach to security, C) adopting a 'best-of-breed' approach to security, D) adopting a 'defense-in-depth' approach to security");
        answers.add("A) adopting a 'best-in-suite' approach to security");

        questions.add("Which type of attack can execute the code injected by attackers as part of user inputs?");
        options.add("A) Ping of death, B) Buffer overflow, C) Distributed Denial of Service, D) Denial of Service");
        answers.add("B) Buffer overflow");

        questions.add("Which activity is not part of risk assessment?");
        options.add("A) identifying and valuing assets, B) analyzing risks by criticality and cost, C) discontinuing activities that introduce risk, D) identifying threats and analyzing vulnerabilities");
        answers.add("C) discontinuing activities that introduce risk");

        questions.add("What type of attack was most likely attempted against the application?");
        options.add("A) brute force, B) session hijacking, C) cross-site scripting, D) directory traversal");
        answers.add("D) directory traversal");

        questions.add("Which quadrant should be the focus of risk management?");
        options.add("A) 1, B) 2, C) 3, D) 4");
        answers.add("B) 2");

        questions.add("Which option will not actively identify a security incident?");
        options.add("A) Extended Detection and Response (XDR), B) Cloud Security Posture Management (CSPM), C) Security Information Event Management (SEIM), D) Endpoint Detection and Response (EDR)");
        answers.add("B) Cloud Security Posture Management (CSPM)");

        questions.add("What factors are used in this multi-factor authentication scenario?");
        options.add("A) what you have and what you do, B) what you know and what you are, C) what you have and what you know, D) what you do and what you know");
        answers.add("C) what you have and what you know");

        questions.add("Which option is a list of publicly disclosed information security defects?");
        options.add("A) DBIR, B) CVE, C) CWE, D) CERT");
        answers.add("C) CWE");

        questions.add("What is cryptovirology?");
        options.add("A) Plain cryptography, B) Antivirus, C) Design powerful malicious software, D) Asymmetric backdoor");
        answers.add("C) Design powerful malicious software");

        questions.add("What does a metamorphic virus do?");
        options.add("A) Static analyser, B) Antivirus, C) Generates a whole variable code using a variable encryptor, D) Mutation function");
        answers.add("C) Generates a whole variable code using a variable encryptor");

        questions.add("What is the most common cause of cyber incidents in organisations?");
        options.add("A) Vulnerabilities in software, B) Social Engineering, C) Ransomware, D) Phishing");
        answers.add("B) Social Engineering");

        questions.add("Which of the following terms is used to describe a collection of unrelated patches?");
        options.add("A) Hotfix, B) Update, C) Security Fix, D) Service Pack");
        answers.add("A) Hotfix");

        questions.add("How often should security teams conduct a review of the privileged access that a user has to sensitive systems?");
        options.add("A) On a daily basis, B) On a periodic basis, C) When a User leaves the organisation, D) When a User changes roles");
        answers.add("B) On a periodic basis");
        
        questions.add("What term is used to describe the default set of privileges assigned to a user when a new account is created?");
        options.add("A) Aggregation, B) Transitivity, C) Baseline, D) Entitlement");
        answers.add("D) Entitlement");

        questions.add("Who is the father of computer security?");
        options.add("A) August Kerckhoffs, B) Bob Thomas, C) Charles Thomas, D) Robert Kerckhoffs");
        answers.add("A) August Kerckhoffs");

        questions.add("Which type of attack uses formal emails to entice specific individuals into signing in and changing their passwords?");
        options.add("A) Vishing, B) Spear phishing, C) Brute force attack, D) Password spray attack");
        answers.add("B) Spear phishing");

        questions.add("A data asset register should contain which of the following?");
        options.add("A) The location of the data, B) The value of the asset, C) The owner of the asset, D) All of these options");
        answers.add("D) All of these options");

        questions.add("Where can you check to see if you have credentials in cleartext to access the target webpage?");
        options.add("A) Select Go on the Repeater tab, B) See the loopback address and port are on in the Options tab, C) Check the Raw section in the Intercept tab, D) Check for a login.php line in the Proxy tab");
        answers.add("D) Check for a login.php line in the Proxy tab");

        questions.add("Threat actors will attempt to find an attack vector on their target by mapping the attack ___.");
        options.add("A) surface, B) infrastructure, C) threat, D) door");
        answers.add("A) surface");

        questions.add("How would an organisation ensure software product support in the event a supplier goes out of business or is sold to a competitor?");
        options.add("A) They could employ the software developers once the supplier organisation has gone out of business, B) They could ensure support by acquiring the supplier organisation, C) They could ensure support through an escrow agreement, D) They could reverse engineer the product so that it could be supported in-house");
        answers.add("C) They could ensure support through an escrow agreement");

        questions.add("Which of the following is the security standard that applies to the certification of security controls within products?");
        options.add("A) ISO/IEC 27001, B) ISO/IEC 9000, C) ISO/IEC 15408, D) ISO/IEC 13335");
        answers.add("C) ISO/IEC 15408");

        questions.add("What is the main role of the board member known as the information security manager?");
        options.add("A) To ensure appropriate security controls are implemented across the organisation, B) To provide day-to-day management of the information assurance function, C) To have a detailed understanding of the organisation's vulnerabilities, D) To have a detailed understanding of threats faced by the organisation");
        answers.add("A) To ensure appropriate security controls are implemented across the organisation");

        questions.add("What are the two main approaches used to determine the likelihood of a threat occurring?");
        options.add("A) Qualitative and statistical, B) Statistical and quantitative, C) Statistical and assumptive, D) Qualitative and quantitative");
        answers.add("D) Qualitative and quantitative");

        questions.add("Which type of hackers are often organized and funded by a nation's military intelligence or security services, and attempt to gain access to a foreign adversary's state secrets or military intelligence?");
        options.add("A) Hacktivists, B) Competitors, C) Black hat hackers, D) State-sponsored hackers");
        answers.add("D) State-sponsored hackers");

        questions.add("Which of the following methods combines two binary streams to create one new stream that contains hidden information that cannot be retrieved without the other stream that was used to create it?");
        options.add("A) Substitution cipher, B) Weaponization, C) Transposition cipher, D) XOR encryption");
        answers.add("D) XOR encryption");

        questions.add("What is Drupalgeddon?");
        options.add("A) A web app proxy tool, B) A DDoS bot, C) A network packet capturing device, D) A SQL injection flaw");
        answers.add("D) A SQL injection flaw");

        questions.add("The algorithm used by an encryption technique to hide information is known as the ___.");
        options.add("A) Cipher, B) XOR, C) Encoding, D) Cyber kill chain");
        answers.add("A) Cipher");
        
        questions.add("Which of these is not an issue that could arise as a result of outsourcing software development?");
        options.add("A) The accidental or deliberate introduction of malicious Code , B)The loss of intellectual property or trade secrets , C)Legal disputes could develop between the customer and the supplier , D)The laws on the protection of data do not apply to information sent to a third party");
        answers.add("D)The laws on the protection of data do not apply to information sent to a third party");

    }
    

    
    public static void main(String[]args){
        new CyberSecurity_Quiz(name).setVisible(true);
    }
    
}
