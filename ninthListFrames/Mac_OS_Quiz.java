package ninthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class Mac_OS_Quiz extends Quiz {
    
    public Mac_OS_Quiz(String name) {
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
    
    // questions:36
    @Override
    public final void loadQuestions() {
        
        questions.add("Which shortcut is used to take a screenshot of the entire screen in macOS?");
        options.add("A) Command + Shift + 3, B) Command + Shift + 4, C) Command + Shift + 5, D) Command + Shift + 2");
        answers.add("A) Command + Shift + 3");
        
        questions.add("What is the default web browser in macOS?");
        options.add("A) Safari, B) Chrome, C) Firefox, D) Opera");
        answers.add("A) Safari");
        
        questions.add("Which application is used to manage and install software updates on macOS?");
        options.add("A) App Store, B) Software Update, C) System Preferences, D) Terminal");
        answers.add("A) App Store");
        
        questions.add("How do you force quit an application on macOS?");
        options.add("A) Command + Option + Escape, B) Command + Shift + Escape, C) Command + Control + Escape, D) Command + Alt + Escape");
        answers.add("A) Command + Option + Escape");
        
        questions.add("What is the file system used by macOS?");
        options.add("A) APFS, B) NTFS, C) HFS+, D) exFAT");
        answers.add("A) APFS");
        
        questions.add("Which key is used to access Spotlight Search in macOS?");
        options.add("A) Command + Space, B) Command + S, C) Command + F, D) Command + Option + Space");
        answers.add("A) Command + Space");
        
        questions.add("What is the default email client in macOS?");
        options.add("A) Mail, B) Outlook, C) Thunderbird, D) Postbox");
        answers.add("A) Mail");
        
        questions.add("How do you open the Terminal application in macOS?");
        options.add("A) Applications > Utilities > Terminal, B) Applications > Terminal, C) Finder > Terminal, D) Launchpad > Terminal");
        answers.add("A) Applications > Utilities > Terminal");
        
        questions.add("Which macOS feature allows you to use your iPad as a second display?");
        options.add("A) Sidecar, B) AirPlay, C) Continuity, D) Handoff");
        answers.add("A) Sidecar");
        
        questions.add("How do you check the macOS version you are using?");
        options.add("A) Apple menu > About This Mac, B) System Preferences > About This Mac, C) Finder > About This Mac, D) Spotlight > About This Mac");
        answers.add("A) Apple menu > About This Mac");
        
        questions.add("Which application is used for creating and editing documents in macOS?");
        options.add("A) Pages, B) Word, C) Notes, D) TextEdit");
        answers.add("A) Pages");
        
        questions.add("How do you access System Preferences in macOS?");
        options.add("A) Apple menu > System Preferences, B) Finder > System Preferences, C) Applications > System Preferences, D) Spotlight > System Preferences");
        answers.add("A) Apple menu > System Preferences");
        
        questions.add("Which application is used to backup data on macOS?");
        options.add("A) Time Machine, B) iCloud, C) Disk Utility, D) Carbon Copy Cloner");
        answers.add("A) Time Machine");
        
        questions.add("What is the command to list files in the Terminal on macOS?");
        options.add("A) ls, B) dir, C) list, D) show");
        answers.add("A) ls");
        
        questions.add("How do you create a new folder in Finder on macOS?");
        options.add("A) File > New Folder, B) Edit > New Folder, C) Finder > New Folder, D) View > New Folder");
        answers.add("A) File > New Folder");
        
        questions.add("What is the default video editing software in macOS?");
        options.add("A) iMovie, B) Final Cut Pro, C) Adobe Premiere, D) DaVinci Resolve");
        answers.add("A) iMovie");
        
        questions.add("How do you open the Activity Monitor in macOS?");
        options.add("A) Applications > Utilities > Activity Monitor, B) Applications > Activity Monitor, C) Finder > Activity Monitor, D) Spotlight > Activity Monitor");
        answers.add("A) Applications > Utilities > Activity Monitor");
        
        questions.add("Which macOS feature allows you to copy and paste between Apple devices?");
        options.add("A) Universal Clipboard, B) Handoff, C) Continuity, D) AirDrop");
        answers.add("A) Universal Clipboard");
        
        questions.add("How do you uninstall an application in macOS?");
        options.add("A) Drag the application to the Trash, B) Right-click and select Uninstall, C) System Preferences > Applications > Uninstall, D) Applications > Utilities > Uninstall");
        answers.add("A) Drag the application to the Trash");
        
        questions.add("Which macOS feature helps to manage and organize your desktop files automatically?");
        options.add("A) Stacks, B) Finder, C) Spotlight, D) Dock");
        answers.add("A) Stacks");
        
        questions.add("How do you access the Force Quit menu on macOS?");
        options.add("A) Apple menu > Force Quit, B) Finder > Force Quit, C) Applications > Force Quit, D) Spotlight > Force Quit");
        answers.add("A) Apple menu > Force Quit");
        
        questions.add("What is the default music player in macOS?");
        options.add("A) Music, B) iTunes, C) Spotify, D) QuickTime Player");
        answers.add("A) Music");
        
        questions.add("Which shortcut is used to minimize all windows and show the desktop in macOS?");
        options.add("A) Command + F3, B) Command + D, C) Command + Option + M, D) Command + H");
        answers.add("A) Command + F3");
        
        questions.add("How do you enable Dark Mode in macOS?");
        options.add("A) System Preferences > General > Dark Mode, B) Finder > View > Dark Mode, C) Applications > Utilities > Dark Mode, D) Apple menu > Dark Mode");
        answers.add("A) System Preferences > General > Dark Mode");
        
        questions.add("Which macOS feature allows you to quickly find files, apps, and information on the web?");
        options.add("A) Spotlight, B) Finder, C) Siri, D) Launchpad");
        answers.add("A) Spotlight");
        
        questions.add("How do you lock your screen in macOS?");
        options.add("A) Control + Command + Q, B) Command + L, C) Command + K, D) Control + Shift + Q");
        answers.add("A) Control + Command + Q");
        
        questions.add("Which application is used for creating and editing spreadsheets in macOS?");
        options.add("A) Numbers, B) Excel, C) Sheets, D) Calc");
        answers.add("A) Numbers");
        
        questions.add("How do you open the Disk Utility in macOS?");
        options.add("A) Applications > Utilities > Disk Utility, B) Applications > Disk Utility, C) Finder > Disk Utility, D) Spotlight > Disk Utility");
        answers.add("A) Applications > Utilities > Disk Utility");
        
        questions.add("Which macOS feature allows you to send and receive text messages from your Mac?");
        options.add("A) Messages, B) Mail, C) FaceTime, D) iChat");
        answers.add("A) Messages");
        
        questions.add("How do you set up a new user account on macOS?");
        options.add("A) System Preferences > Users & Groups, B) Finder > Users & Groups, C) Applications > Users & Groups, D) Spotlight > Users & Groups");
        answers.add("A) System Preferences > Users & Groups");
        
        questions.add("Which command is used to change directories in the Terminal on macOS?");
        options.add("A) cd, B) dir, C) change, D) chdir");
        answers.add("A) cd");
        
        questions.add("What is the default PDF viewer in macOS?");
        options.add("A) Preview, B) Acrobat Reader, C) PDF Viewer, D) Foxit Reader");
        answers.add("A) Preview");
        
        questions.add("How do you create a new note in the Notes app on macOS?");
        options.add("A) File > New Note, B) Edit > New Note, C) Finder > New Note, D) View > New Note");
        answers.add("A) File > New Note");
        
        questions.add("Which macOS feature allows you to quickly access your favorite and frequently used apps?");
        options.add("A) Dock, B) Launchpad, C) Spotlight, D) Finder");
        answers.add("A) Dock");
        
        questions.add("How do you customize the Dock on macOS?");
        options.add("A) System Preferences > Dock, B) Finder > Dock, C) Applications > Dock, D) Apple menu > Dock");
        answers.add("A) System Preferences > Dock");
        
        questions.add("Which macOS feature allows you to switch between open applications?");
        options.add("A) Command + Tab, B) Command + Space, C) Command + Option, D) Command + Shift");
        answers.add("A) Command + Tab");
        
    }

    public static void main(String[] args) {
        new Mac_OS_Quiz(name).setVisible(true);
    }
    
}
