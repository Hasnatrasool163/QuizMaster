
package ninthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Windows_Quiz extends Quiz{
    

    public Windows_Quiz(String name) {
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

        questions.add("What is the first version of Windows released by Microsoft?");
        options.add("A) Windows 1.0, B) Windows 2.0, C) Windows 3.0, D) Windows 95");
        answers.add("A) Windows 1.0");

        questions.add("What is the latest version of Windows as of 2023?");
        options.add("A) Windows 10, B) Windows 11, C) Windows 12, D) Windows 13");
        answers.add("B) Windows 11");

        questions.add("What is the Windows operating system designed for?");
        options.add("A) Mobile devices, B) Desktop computers, C) Servers, D) Gaming consoles");
        answers.add("B) Desktop computers");

        questions.add("What is the Windows Explorer used for?");
        options.add("A) Browsing the internet, B) Managing files and folders, C) Playing games, D) Editing documents");
        answers.add("B) Managing files and folders");

        questions.add("What is the Task Manager used for in Windows?");
        options.add("A) Managing tasks and processes, B) Configuring system settings, C) Installing software, D) Uninstalling software");
        answers.add("A) Managing tasks and processes");

        questions.add("What is the Windows Registry used for?");
        options.add("A) Storing system settings and configurations, B) Managing user accounts, C) Installing software, D) Uninstalling software");
        answers.add("A) Storing system settings and configurations");

        questions.add("What is the Windows Search function used for?");
        options.add("A) Searching the internet, B) Searching files and folders, C) Searching for software, D) Searching for hardware");
        answers.add("B) Searching files and folders");

        questions.add("What is the Windows Update feature used for?");
        options.add("A) Updating software, B) Updating hardware drivers, C) Installing security patches, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the Windows Defender feature used for?");
        options.add("A) Protecting against malware and viruses, B) Configuring system settings, C) Managing user accounts, D) Installing software");
        answers.add("A) Protecting against malware and viruses");
        
        questions.add("What is the Windows Taskbar used for?");
        options.add("A) Displaying icons and notifications, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Displaying icons and notifications");

        questions.add("What is the Windows Start Menu used for?");
        options.add("A) Starting applications, B) Managing files and folders, C) Configuring system settings, D) Shutting down the computer");
        answers.add("A) Starting applications");

        questions.add("What is the Windows Desktop used for?");
        options.add("A) Displaying icons and shortcuts, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Displaying icons and shortcuts");

        questions.add("What is the Windows File Explorer used for?");
        options.add("A) Managing files and folders, B) Configuring system settings, C) Running applications, D) Displaying icons and notifications");
        answers.add("A) Managing files and folders");

        questions.add("What is the Windows Command Prompt used for?");
        options.add("A) Running command-line commands, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Running command-line commands");

        questions.add("What is the Windows PowerShell used for?");
        options.add("A) Running command-line commands, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Running command-line commands");

        questions.add("What is the Windows Control Panel used for?");
        options.add("A) Configuring system settings, B) Managing files and folders, C) Running applications, D) Displaying icons and notifications");
        answers.add("A) Configuring system settings");

        questions.add("What is the Windows Device Manager used for?");
        options.add("A) Managing hardware devices, B) Managing software applications, C) Configuring system settings, D) Running applications");
        answers.add("A) Managing hardware devices");

        questions.add("What is the Windows Event Viewer used for?");
        options.add("A) Viewing system events and logs, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Viewing system events and logs");
        
        questions.add("What is the Windows Disk Management used for?");
        options.add("A) Managing disk partitions, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Managing disk partitions");

        questions.add("What is the Windows System Restore used for?");
        options.add("A) Restoring system settings, B) Backing up data, C) Configuring system settings, D) Running applications");
        answers.add("A) Restoring system settings");

        questions.add("What is the Windows Windows Subsystem for Linux (WSL) used for?");
        options.add("A) Running Linux commands, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Running Linux commands");

        questions.add("What is the Windows Remote Desktop used for?");
        options.add("A) Accessing remote computers, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Accessing remote computers");

        questions.add("What is the Windows Windows Update Tool used for?");
        options.add("A) Updating Windows, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Updating Windows");

        questions.add("What is the Windows Microsoft Store used for?");
        options.add("A) Downloading applications, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Downloading applications");

        questions.add("What is the Windows Windows Security used for?");
        options.add("A) Protecting against malware and viruses, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Protecting against malware and viruses");

        questions.add("What is the Windows Firewall used for?");
        options.add("A) Blocking unauthorized access, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Blocking unauthorized access");
        
        questions.add("What is the Windows Taskbar used for?");
        options.add("A) Displaying icons and notifications, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Displaying icons and notifications");

        questions.add("What is the Windows Start Menu used for?");
        options.add("A) Starting applications, B) Managing files and folders, C) Configuring system settings, D) Shutting down the computer");
        answers.add("A) Starting applications");

        questions.add("What is the Windows Desktop used for?");
        options.add("A) Displaying icons and shortcuts, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Displaying icons and shortcuts");

        questions.add("What is the Windows File Explorer used for?");
        options.add("A) Managing files and folders, B) Configuring system settings, C) Running applications, D) Displaying icons and notifications");
        answers.add("A) Managing files and folders");

        questions.add("What is the Windows Command Prompt used for?");
        options.add("A) Running command-line commands, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Running command-line commands");

        questions.add("What is the Windows PowerShell used for?");
        options.add("A) Running command-line commands, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Running command-line commands");

        questions.add("What is the Windows Control Panel used for?");
        options.add("A) Configuring system settings, B) Managing files and folders, C) Running applications, D) Displaying icons and notifications");
        answers.add("A) Configuring system settings");

        questions.add("What is the Windows Device Manager used for?");
        options.add("A) Managing hardware devices, B) Managing software applications, C) Configuring system settings, D) Running applications");
        answers.add("A) Managing hardware devices");

        questions.add("What is the Windows Event Viewer used for?");
        options.add("A) Viewing system events and logs, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Viewing system events and logs");

        questions.add("What is the Windows Disk Management used for?");
        options.add("A) Managing disk partitions, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Managing disk partitions");

        questions.add("What is the Windows System Restore used for?");
        options.add("A) Restoring system settings, B) Backing up data, C) Configuring system settings, D) Running applications");
        answers.add("A) Restoring system settings");

        questions.add("What is the Windows Windows Subsystem for Linux (WSL) used for?");
        options.add("A) Running Linux commands, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Running Linux commands");

        questions.add("What is the Windows Remote Desktop used for?");
        options.add("A) Accessing remote computers, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Accessing remote computers");

        questions.add("What is the Windows Windows Update Tool used for?");
        options.add("A) Updating Windows, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Updating Windows");

        questions.add("What is the Windows Microsoft Store used for?");
        options.add("A) Downloading applications, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Downloading applications");

        questions.add("What is the Windows Windows Security used for?");
        options.add("A) Protecting against malware and viruses, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Protecting against malware and viruses");

        questions.add("What is the Windows Firewall used for?");
        options.add("A) Blocking unauthorized access, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Blocking unauthorized access");

        questions.add("What is the Windows Task Scheduler used for?");
        options.add("A) Scheduling tasks, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Scheduling tasks");

        questions.add("What is the Windows Backup and Restore used for?");
        options.add("A) Backing up and restoring data, B) Managing files and folders, C) Configuring system settings, D) Running applications");
        answers.add("A) Backing up and restoring data");

    }
    
    public static void main(String[]args){
        new Windows_Quiz(name).setVisible(true);
    }
    
}


