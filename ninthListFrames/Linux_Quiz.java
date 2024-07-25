package ninthListFrames;

import frame.Quiz;
/**
 * @author MuhammadHasnatRasool
 */
public class Linux_Quiz extends Quiz {

    public Linux_Quiz(String name) {
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

    // questions:97
    @Override
    public final void loadQuestions() {

        questions.add("What is Linux?");
        options.add("A) An operating system, B) A software application, C) A programming language, D) A hardware device");
        answers.add("A) An operating system");

        questions.add("What command is used to determine the amount of disk usage for a directory?");
        options.add("A) find, B) fdisk, C) du, D) df");
        answers.add("C) du");

        questions.add("A backup drive was created using dd to make a bit-for-bit copy. When the drive is inserted into an iSCSI target before it is booted up, the data appears to be missing. What could have happened?");
        options.add("A) The backup drive is corrupted and needs to be re-created., B) When the backup drive was duplicated, the label was as well. When booted, the system mounted the old duplicates drive by its identical label., C) There is a conflict between the physical location of the backup drive and the original drive., D) The backup process went wrong, and the old drive was duplicated over the original drive.");
        answers.add("B) When the backup drive was duplicated, the label was as well. When booted, the system mounted the old duplicates drive by its identical label.");

        questions.add("What is the key difference between a redirect (>) and piping to the tee command?");
        options.add("A) The tee command sends output only to STDOUT and STDERR., B) A redirect sends output to STDOUT and a file, whereas a tee sends output only to STDOUT., C) Nothing, they are the same., D) The tee command sends output to STDOUT and a file, whereas a redirect sends output only to a file.");
        answers.add("D) The tee command sends output to STDOUT and a file, whereas a redirect sends output only to a file.");

        questions.add("What is the purpose of the sync command?");
        options.add("A) To synchronize the system clock with an external time source., B) To flush the buffer cache and ensure data is written to disk., C) To update the system's package list., D) To restart the system.");
        answers.add("B) To flush the buffer cache and ensure data is written to disk.");

        questions.add("What is the default editor used by the crontab command?");
        options.add("A) vim, B) emacs, C) nano, D) ed");
        answers.add("A) vim");

        questions.add("What is the purpose of the whereis command?");
        options.add("A) To search for files in the system's directories, B) To search for commands in the system's PATH, C) To display the system's environment variables, D) To search for binaries, sources, and manuals");
        answers.add("D) To search for binaries, sources, and manuals");

        questions.add("What is the purpose of the grep command?");
        options.add("A) To search for patterns in files, B) To display the system's memory usage, C) To display the system's disk usage, D) To display the system's CPU usage");
        answers.add("A) To search for patterns in files");

        questions.add("What is the purpose of the find command?");
        options.add("A) To search for files based on various criteria, B) To display the system's memory usage, C) To display the system's disk usage, D) To display the system's CPU usage");
        answers.add("A) To search for files based on various criteria");

        questions.add("What is the purpose of the xargs command?");
        options.add("A) To execute a command on a list of files, B) To display the system's memory usage, C) To display the system's disk usage, D) To display the system's CPU usage");
        answers.add("A) To execute a command on a list of files");

        questions.add("What is the purpose of the chmod command?");
        options.add("A) To change the permissions of a file or directory, B) To change the ownership of a file or directory, C) To change the location of a file or directory, D) To change the name of a file or directory");
        answers.add("A) To change the permissions of a file or directory");

        questions.add("What is the purpose of the chown command?");
        options.add("A) To change the ownership of a file or directory, B) To change the permissions of a file or directory, C) To change the location of a file or directory, D) To change the name of a file or directory");
        answers.add("A) To change the ownership of a file or directory");

        questions.add("What is the purpose of the mkdir command?");
        options.add("A) To create a new directory, B) To delete a directory, C) To rename a directory, D) To list the contents of a directory");
        answers.add("A) To create a new directory");

        questions.add("What is the purpose of the rm command?");
        options.add("A) To remove a file or directory, B) To rename a file or directory, C) To move a file or directory, D) To copy a file or directory");
        answers.add("A) To remove a file or directory");

        questions.add("What is the purpose of the cp command?");
        options.add("A) To copy a file or directory, B) To move a file or directory, C) To remove a file or directory, D) To rename a file or directory");
        answers.add("A) To copy a file or directory");

        questions.add("Which kernel module do you need to load to use interface bonding?");
        options.add("A) bonding, B) team, C) netbond, D) bond");
        answers.add("A) bonding");

        questions.add("What does this command string do? find / -size -10K -exec ls -l {} ;");
        options.add("A) It finds all files larger than 10k and long lists them using the ls command., B) It finds all files of size 10k using ls -l and hands them off to the find command to display., C) It finds all files in the / directory of size 10k and long lists them., D) It finds all files in the file system smaller than 10k and long lists them using the ls command.");
        answers.add("D) It finds all files in the file system smaller than 10k and long lists them using the ls command.");

        questions.add("To change the priority of multiple swap partitions, which file would you edit?");
        options.add("A) /proc/swapiness, B) /etc/fstab, C) /etc/mounts, D) /etc/swaps");
        answers.add("B) /etc/fstab");

        questions.add("What would you type to list all systemd service unit files, whether they are enabled or not?");
        options.add("A) systemctl list-services, B) chkconfig --list-all, C) systemctl list-unit-files -at service, D) systemctl list-unit-files -t service");
        answers.add("C) systemctl list-unit-files -at service");

        questions.add("You can set Linux group passwords using which command?");
        options.add("A) gpasswd, B) passwd, C) editsam, D) grouppass");
        answers.add("A) gpasswd");

        questions.add("With most GNU commands, if an option is a word, what will it be preceded by?");
        options.add("A) two dashes, B) a backslash, C) one dash, D) nothing");
        answers.add("A) two dashes");

        questions.add("What would happen if you have a script file named script that takes a long time to complete, and you type nohup ./script & in the command line?");
        options.add("A) The script will remain running in the background even if you reboot the system., B) The script will run in your terminal and you will not be able to do anything until it completes., C) The script will run in the background until you end the session., D) The script will run in the background and will continue running even if you end the session.");
        answers.add("D) The script will run in the background and will continue running even if you end the session.");

        questions.add("To elevate privileges using the sudo command, a user must **_.");
        options.add("A) enter the root user's password, B) enter their own password, C) enter the sudo user's password, D) change to the root group");
        answers.add("B) enter their own password");

        questions.add("When would this system cron job run its task? 0 22 * * 1-5");
        options.add("A) on the 22nd of every month from June to May, B) at 10:00 PM Monday to Friday, C) every 22 minutes every day except weekends, D) from 1:00 AM to 5:00 AM on the 22nd of every month");
        answers.add("B) at 10:00 PM Monday to Friday");

        questions.add("How does TCP Wrappers differ from a firewall?");
        options.add("A) Firewalls are only service specific, whereas TCP Wrappers can block all traffic., B) TCP Wrappers works at the network layer, so it blocks traffic before the firewall even sees it., C) Firewalls easily spawn commands to operate on connection data, whereas TCP Wrappers cannot., D) TCP Wrappers works at the application layer, so it can make access decisions on encrypted data.");
        answers.add("D) TCP Wrappers works at the application layer, so it can make access decisions on encrypted data.");

        questions.add("What does the /etc/nsswitch.conf file manage?");
        options.add("A) priority of one DNS server over another, B) per network interface DNS server configuration, C) alternative DNS services, D) sources for name service information");
        answers.add("D) sources for name service information");

        questions.add("What is a major advantage of using Logical Volume Management (LVM)?");
        options.add("A) Access to a drive is faster than with standard partitions., B) Volumes can be resized smaller without unmounting them., C) Repairing filesystem errors is easier than with standard partitions., D) Volumes can be resized even if the free space is not contiguous.");
        answers.add("D) Volumes can be resized even if the free space is not contiguous.");

        questions.add("What is one major difference between brace expansion and globs?");
        options.add("A) Globs create a list; brace expansion matches pattern., B) Brace expansion requires files to exist; globs do not., C) Brace expansion creates a list; globs match the list of pathnames., D) Globs get processes first and brace expansion later.");
        answers.add("C) Brace expansion creates a list; globs match the list of pathnames.");

        questions.add("To remove all ACLs from a directory, use setfacl with which options?");
        options.add("A) -d, B) -k, C) -b, D) -x");
        answers.add("C) -b");

        questions.add("Which choice will not print 'Hello World' in the terminal?");
        options.add("A) myVar = 5 [[ $myVar -lt 10 ]] && echo ' Hello World', B) myVar = 5 [[ $myVar -lt 10 ]] || echo ' Hello World', C) myVar = 5 [[ ! $myVar -gt 10 ]] && echo ' Hello World', D) myVar = 5 [[ $myVar -gt 10 ]] || echo ' Hello World'");
        answers.add("B) myVar = 5 [[ $myVar -lt 10 ]] || echo ' Hello World'");

        questions.add("What is not inherited by child process?");
        options.add("A) shell aliases, B) userid, C) environmental variables, D) scheduling priority");
        answers.add("A) shell aliases");

        questions.add("What NFS option allows the root user to access NFS shares as the root user?");
        options.add("A) no_admin_squash, B) no_root_squash, C) allow_root_access, D) all_squash");
        answers.add("B) no_root_squash");

        questions.add("You send an email to a remote client using the following syntax. What will be in the body of the email? date | mail -s 'This is a remote test' user1@rhhost1.localnet.com");
        options.add("A) 'This is a remote test', B) the date, the time, and the words 'This is a remote test', C) The email subject shows 'This is a remote test' but the body of the email will be empty., D) the current date and time");
        answers.add("D) the current date and time");

        questions.add("What is the /etc/hosts file used for?");
        options.add("A) resolving the local name, B) blocking sites using iptables, C) setting the hostname, D) configuring DNS name servers");
        answers.add("A) resolving the local name");

        questions.add("In an extended regular expression, you would use (pattern){3} to match three instances of the pattern. How would you match the same thing with an extended glob?");
        options.add("A) 3(pattern), B) {0,3}(pattern}, C) Occurrence quantifiers are not supported in Bash's version of extended globs, so this is not possible., D) {3}(pattern})");
        answers.add("C) Occurrence quantifiers are not supported in Bash's version of extended globs, so this is not possible.");

        questions.add("When configuring a Samba share, how would the engineering group be specified in the smb.conf?");
        options.add("A) Samba uses Linux operating system groups from the /etc/group file; just specify the group name., B) It would be preceded by a percent sign (%), such as %engineers., C) Use the group name by itself; Samba checks for its existence., D) It would be preceded by an @ symbol, such as @engineering.");
        answers.add("D) It would be preceded by an @ symbol, such as @engineering.");

        questions.add("To configure the Kerberos client, which command should you use to import the keytab file?");
        options.add("A) krb5-workstation, B) ktutil, C) pam_krb5, D) kdb5_util");
        answers.add("B) ktutil");

        questions.add("To search from the current cursor position up to the beginning of the file using VIM, type _ and then the search criteria.");
        options.add("A) ?, B) , C) /, D) /search");
        answers.add("A) ?");

        questions.add("Assume the variable myNumber holds a string consisting of 10 digits. What will this command output? echo $myNumber | sed -e 's/^[[:digit:]][[:digit:]][[:digit:]]/(&)/g'");
        options.add("A) It will only match digits—and since the string has only digits, the command will output the same number without changes., B) It will output the same 10-digit number, but every digit will be inside parentheses., C) It will output the entire 10-digit number inside parentheses., D) It will output the same 10-digit number, but the first 3 digits will be inside parentheses.");
        answers.add("D) It will output the same 10-digit number, but the first 3 digits will be inside parentheses.");

        questions.add("What would this sed command do? sed -E 's/[a-Z]{4}/(&)/' textfile.txt");
        options.add("A) It would substitute the letter with an ampersand (&)., B) It would replace all letters in the textfile.txt file with ampersand (&)., C) It would replace the first four letters with an ampersand (&)., D) It would place parentheses around the first four letters of each line of textfile.txt.");
        answers.add("D) It would place parentheses around the first four letters of each line of textfile.txt.");

        questions.add("Packages can be downloaded but not installed with yum or dnf by specifying which option?");
        options.add("A) None of these answers. yum does not support downloading packages without installing them., B) --downloaddir, C) -d, D) --downloadonly");
        answers.add("D) --downloadonly");

        questions.add("What character class is equal to this set? [0-9]");
        options.add("A) [[:alnum:]], B) [[:digit:]], C) [[:alpha:]], D) [[:num:]]");
        answers.add("B)[[:digit:]]");

        questions.add("When archiving files, which command will preserve all file attributes including ACLs and SELinux security context?");
        options.add("A) zip, B) tar, C) archive, D) gzip");
        answers.add("B) tar");

        questions.add("In a systemd-based OS, you can change the system hostname by editing /etc/hostname manually and then doing what?");
        options.add("A) Restart dhcpd., B) Run /etc/hostname., C) Nothing, the system notices automatically., D) Notify systemd to update it by restarting the systemd-hostnamed service.");
        answers.add("C) Nothing, the system notices automatically.");

        questions.add("What command would you use to resize an LVM volume group to include an additional physical volume?");
        options.add("A) vgadd, B) vgresize, C) vgappend, D) vgextend");
        answers.add("D) vgextend");

        questions.add("What is the default editor used by the crontab command?");
        options.add("A) vim, B) emacs, C) nano, D) ed");
        answers.add("A) vim");

        questions.add("What is the purpose of the uptime command?");
        options.add("A) To display the current time, B) To display the system's uptime and load average, C) To display the system's memory usage, D) To display the system's disk usage");
        answers.add("B) To display the system's uptime and load average");

        questions.add("What is the purpose of the free command?");
        options.add("A) To display the system's memory usage, B) To display the system's disk usage, C) To display the system's CPU usage, D) To display the system's network usage");
        answers.add("A) To display the system's memory usage");

        questions.add("What is the purpose of the which command?");
        options.add("A) To search for files in the system's directories, B) To search for commands in the system's PATH, C) To display the system's environment variables, D) To display the system's shell configuration");
        answers.add("B) To search for commands in the system's PATH");

        questions.add("When would this system cron job run its task? 0 1 * * *");
        options.add("A) every minute of the hour, B) every hour of every day, C) every day at 1:00 AM, D) only on Mondays");
        answers.add("C) every day at 1:00 AM");

        questions.add("ifconfig has been deprecated. What command is now recommended for changing IP addresses in the live config?");
        options.add("A) netconf, B) ipconfig, C) ipman, D) ip");
        answers.add("D) ip");

        questions.add("To mount a drive by its ID, what command would you use first to retrieve it?");
        options.add("A) df -h, B) listid, C) ls -l, D) blkid");
        answers.add("D) blkid");

        questions.add("Linux file access control lists (ACLs) are _.");
        options.add("A) discretionary access control system permissions layered over standard Linux permissions, B) mandatory access control system permissions layered over standard Linux permissions, C) a type of firewall for Linux, D) the same as standard Linux permissions");
        answers.add("A) discretionary access control system permissions layered over standard Linux permissions");

        questions.add("When using iproute2, how do you show routing information for an IPv6 network?");
        options.add("A) route -ipv6, B) route, C) ip -6 route show, D) ip route show");
        answers.add("C) ip -6 route show");

        questions.add("What does this command string do? find / -size +10M -exec ls -l {} ;");
        options.add("A) It finds all files using ls -l and hands them off to the find command to display., B) It finds all files older than 10 minutes and long lists them using the ls command., C) It finds all files larger than 10 MB and long lists them using the ls command., D) It uses the ls command to find all files in the filesystem matching the {} wildcard.");
        answers.add("C) It finds all files larger than 10 MB and long lists them using the ls command.");

        questions.add("What would this locate command show? locate --regexp '^/usr.*pixmaps.*jpg$'");
        options.add("A) all files in a directory named pixmaps, B) all files ending in '.jpg', C) all file paths that start with '/usr', include the word 'pixmaps', and end with '.jpg', D) all file paths that include '/usr/pixmaps' and end with '.jpg'");
        answers.add("C) all file paths that start with '/usr', include the word 'pixmaps', and end with '.jpg'");

        questions.add("Which command allows you to do packet analysis from the command line?");
        options.add("A) wireshark, B) ethtool, C) netstat, D) tcpdump");
        answers.add("D) tcpdump");

        questions.add("Which command will tell you how long a system has been running?");
        options.add("A) log, B) uptime, C) runtime, D) access");
        answers.add("B) uptime");

        questions.add("How would you describe PCP (Performance Co-Pilot)?");
        options.add("A) It is an application testing suite used to profile programming code., B) It is a local command used for monitoring local system resources in real time., C) It is a set of tools, services, and libraries for gathering and analyzing performance measures., D) It is a tool designed to change system configuration for purposes of optimization.");
        answers.add("C) It is a set of tools, services, and libraries for gathering and analyzing performance measures.");

        questions.add("You want to resolve a long list of DNS names using dig. What should you do?");
        options.add("A) Create a text file including all names and use the -f option of dig., B) Type in each query manually., C) Write a shell script to send multiple dig queries to the DNS server., D) Save the DNS names in an SQL database and process it with dig.");
        answers.add("A) Create a text file including all names and use the -f option of dig.");

        questions.add("What would this command output? ps -e --format uid,pid,ppid,%cpu,cmd");
        options.add("A) the user ID, process ID, parent process ID, CPU usage, and command name of a process, B) the user ID, group ID, parent process ID, CPU usage, and command name of a process, C) the UUID, process ID, parent process ID, CPU usage, and command name of a process, D) all of these answers");
        answers.add("A) the user ID, process ID, parent process ID, CPU usage, and command name of a process");

        questions.add("Which command in Bash executes the last line in the shell history that starts with ls?");
        options.add("A) !, B) !!, C) !*, D) !ls");
        answers.add("D) !ls");

        questions.add("The ssh-copy-id command copies _ to the remote host.");
        options.add("A) both private and public keys, B) the ssh public key, C) the ssh private key, D) a fingerprint file");
        answers.add("B) the ssh public key");

        questions.add("What is the most popular Linux distribution?");
        options.add("A) Ubuntu, B) Debian, C) Fedora, D) CentOS");
        answers.add("A) Ubuntu");

        questions.add("What is the main benefit of using Linux?");
        options.add("A) It is free and open-source, B) It is easy to use, C) It is fast and efficient, D) It is secure");
        answers.add("A) It is free and open-source");

        questions.add("What is the Linux file system?");
        options.add("A) NTFS, B) FAT32, C) EXT4, D) HFS+");
        answers.add("C) EXT4");

        questions.add("How do you install software on Linux?");
        options.add("A) Using the command line, B) Using a graphical user interface, C) Using a package manager, D) Using a web browser");
        answers.add("C) Using a package manager");

        questions.add("What is the Linux command line?");
        options.add("A) A graphical user interface, B) A text-based interface, C) A programming language, D) A software application");
        answers.add("B) A text-based interface");

        questions.add("What is Linux security?");
        options.add("A) Firewall configuration, B) User authentication, C) Data encryption, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the Linux feature that allows multiple users to access the system?");
        options.add("A) Multi-user support, B) Multi-tasking, C) Virtual memory, D) Networking");
        answers.add("A) Multi-user support");

        questions.add("What is the Linux kernel?");
        options.add("A) The core of the operating system, B) A software application, C) A programming language, D) A hardware device");
        answers.add("A) The core of the operating system");

        questions.add("What is the difference between Linux and UNIX?");
        options.add("A) Linux is free, UNIX is not, B) Linux is open-source, UNIX is not, C) Linux is for servers, UNIX is for desktops, D) Linux is for desktops, UNIX is for servers");
        answers.add("B) Linux is open-source, UNIX is not");

        questions.add("What is the Linux distribution Ubuntu based on?");
        options.add("A) Debian, B) Fedora, C) CentOS, D) Slackware");
        answers.add("A) Debian");

        questions.add("What is the Linux file system hierarchy?");
        options.add("A) /root, /home, /usr, /bin, B) /root, /home, /usr, /etc, C) /root, /home, /usr, /var, D) /root, /home, /usr, /lib");
        answers.add("A) /root, /home, /usr, /bin");

        questions.add("How do you create a new user on Linux?");
        options.add("A) Using the command useradd, B) Using the command adduser, C) Using the command newuser, D) Using the command `createuser");
        answers.add("A) Using the command`useradd");

        questions.add("What is the Linux command to list files and directories?");
        options.add("A) ls, B) dir, C) list, D) files");
        answers.add("A) ls");

        questions.add("What is the Linux command to create a new directory?");
        options.add("A) mkdir, B) mkdir, C) createdir, D) dir");
        answers.add("A) mkdir");

        questions.add("What is the Linux command to delete a file?");
        options.add("A) rm, B) delete, C) del, D) remove");
        answers.add("A) rm");

        questions.add("What is the Linux command to copy a file?");
        options.add("A) cp, B) copy, C) duplicate, D) replicate");
        answers.add("A) cp");

        questions.add("What is the Linux command to move a file?");
        options.add("A) mv, B) move, C) rename, D) transfer");
        answers.add("A) mv");

        questions.add("What is the Linux command to change file permissions?");
        options.add("A) chmod, B) permissions, C) access, D) rights");
        answers.add("A) chmod");

        questions.add("What is the Linux command to change file ownership?");
        options.add("A) chown, B) owner, C) ownership, D) change");
        answers.add("A) chown");

        questions.add("What is the Linux command to view file contents?");
        options.add("A) cat, B) view, C) display, D) show");
        answers.add("A) cat");

        questions.add("What is the Linux command to search for files?");
        options.add("A) find, B) search, C) locate, D) hunt");
        answers.add("A) find");

        questions.add("What is the Linux command to view system processes?");
        options.add("A) ps, B) processes, C) tasks, D) services");
        answers.add("A) ps");

        questions.add("What is the Linux command to view system memory usage?");
        options.add("A) free, B) memory, C) usage, D) stats");
        answers.add("A) free");

        questions.add("What is the Linux command to view system disk usage?");
        options.add("A) df, B) disk, C) usage, D) space");
        answers.add("A) df");

        questions.add("What is the Linux command to view system network connections?");
        options.add("A) netstat, B) network, C) connections, D) sockets");
        answers.add("A) netstat");

        questions.add("What is the Linux command to view system users?");
        options.add("A) users, B) userlist, C) accounts, D) who");
        answers.add("A) users");

        questions.add("What is the Linux command to switch to a different user?");
        options.add("A) su, B) switch, C) change, D) login");
        answers.add("A) su");

        questions.add("What is the Linux command to restart the system?");
        options.add("A) reboot, B) restart, C) shutdown, D) poweroff");
        answers.add("A) reboot");

        questions.add("What is the Linux command to shut down the system?");
        options.add("A) shutdown, B) poweroff, C) halt, D) stop");
        answers.add("A) shutdown");

        questions.add("What is the Linux command to update the system?");
        options.add("A) update, B) upgrade, C) apt-get update, D) yum update");
        answers.add("C) apt-get update");

        questions.add("What is the Linux command to install software?");
        options.add("A) install, B) apt-get install, C) yum install, D) software install");
        answers.add("B) apt-get install");

        questions.add("What is the Linux command to configure network settings?");
        options.add("A) network config, B) netconf, C) ifconfig, D) ip addr");
        answers.add("C) ifconfig");

        questions.add("What is the Linux command to check system security updates?");
        options.add("A) security update, B) apt-get security update, C) yum security update, D) sudo security update");
        answers.add("B) apt-get security update");

        questions.add("What is the Linux command to view system logs?");
        options.add("A) logs, B) view logs, C) system logs, D) journalctl");
        answers.add("D) journalctl");

    }

    public static void main(String[] args) {
        new Linux_Quiz(name).setVisible(true);
    }

}
