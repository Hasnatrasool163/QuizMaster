package seventhListFrames;



import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */
public class GitBash_Quiz extends Quiz{
    

    public GitBash_Quiz(String name) {
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


    // questions:68
    @Override
    public final void loadQuestions() {
        

questions.add(" How can you check your current git version?");
options.add("A) git --v, B) git --version, C) git --option, D) git --current");
answers.add("B) git --version");

questions.add(" What command lets you create a connection between a local and remote repository?");
options.add("A) git remote add new, B) git remote add origin, C) git remote new origin, D) git remote origin");
answers.add("B) git remote add origin");

questions.add(" Describe what these Git commands do to the commit history: bash git reset --hard HEAD~5 git merge --squash HEAD@{1}");
options.add("A) They reset the HEAD to the fifth commit in the repo then merge to the master branch., B) The current branch's HEAD is reset back five commits then prior commits are squashed into a single commit., C) They delete the last five commits., D) They merge the last five commits into a new branch.");
answers.add("B) The current branch's HEAD is reset back five commits, then prior commits are squashed into a single commit.");

questions.add(" Your current project has several branches; master, beta, and push-notifications. You've just finished the notification feature in the push-notification branch, and you want to commit it to beta branch. How can you accomplish this?");
options.add("A) Checkout the push-notifications branch and run git merge beta, B) Checkout the master branch and run git merge beta -> push-notifications, C) Delete the push-notifications branch and it will be committed to the master branch automatically, D) Checkout the beta branch and run git merge push-notifications");
answers.add("D) Checkout the beta branch and run git merge push-notifications");

questions.add(" Which of the following is true when you use the following command? git add -A");
options.add("A) All new and updated files are staged, B) Files are staged in alphabetical order., C) All new files are staged, D) Only updated files are staged");
answers.add("C) All new and updated files are staged");

questions.add(" What will the following command print to the Terminal? git remote -v");
options.add("A) A list of remote repositories and their URLs, B) The current git version you're running, C) An inline editor for modifying remote repositories, D) The last 5 git versions you've installed");
answers.add("C) A list of remote repositories and their URLs");

questions.add(" Looking at the following commands, describe what is happening.  bash git checkout feature-user-location git cherry-pick kj2342134sdf090093f0sdgasdf99sdfo992mmmf9921231");
options.add("A) The commit is being tagged for release on the feature-user-location branch, B) A commit is being copied from its original branch over to the feature-user-location branch, C) The commit is being cherry picked as the new HEAD of the commit history, D) A commit is being copied from the feature-user-location branch to the master branch");
answers.add("C) The branch is switched to the feature-user-location branch, and the specified commit is applied to the branch.");

questions.add(" What does the following command do to the git repository? git reset --soft HEAD^`");
options.add("A) It deletes all previous commits and resets the repository history back to its initial state., B) It resets the working branch to the first commit., C) It keeps the HEAD at the current commit but clears all previous commits., D) It sets HEAD to the previous commit and leaves changes from the undone commit in the stage/index.");
answers.add("D) It sets HEAD to the previous commit and leaves changes from the undone commit in the stage/index.");

questions.add(" You find a bug in your project, but can't locate where it was introduced in the commit history. How would you diagnose this problem?");
options.add("A) Manually backtrack through your commit history., B) Use git search -diff to compare all commits in your repository history., C) Run a git rebase to find the buggy commit., D) Use git bisect to compare the buggy commit to an early commit that works as expected.");
answers.add("D) Use git bisect to compare the buggy commit to an early commit that works as expected.");

questions.add(" Why would the following command be used? git rebase -i HEAD~10`");
options.add("A) To run a comparative search of the last 10 commits for differences, B) To list the last 10 commits and modify them with either the squash or fixup command, C) To delete the last 10 commits and reset the HEAD, D) In order to locally cache the last 10 commits");
answers.add("B) To list the last 10 commits and modify them with either the squash or fixup command");

questions.add(" Why would you use a pre-receive hook in your remote repository?");
options.add("A) You wouldn't you would use it in the local repository, B) To execute a script when a remote receives a push that is triggered before any refs are updated, C) To fire a script after updates are made to the remote repository, D) To debug all commit tags and release versions");
answers.add("B) To execute a script when a remote receives a push that is triggered before any refs are updated");

questions.add(" What option can you use to apply git configurations across your entire git environment?");
options.add("A) `--all`, B) `--master`, C)`--global`, D) `--update`");
answers.add("C) `--global`");

questions.add(" How could you squash multiple commits together without using git merge --squash?");
options.add("A) Caching, B) You can't. git merge --squash is the only git command for that operation., C)Rebasing, D) Reflogging");
answers.add("C) Rebasing");

questions.add(" If you cloned an existing git repository, what would happen?");
options.add("A) A new copy would overwrite the central repository, B) A copy of the repository would be created on your local machine, C) Nothing cloning is not a supported git function, D) A copy of the repository would be created on the hosting platform");
answers.add("B) A copy of the repository would be created on your local machine");

questions.add(" How can you display a list of files added or modified in a specific commit?");
options.add("A) Find the commit in the remote repository as that's the only place that kind of information is stored., B) Use the `diff-tree` command with the commit hash., C) Run `git commit --info` with the commit hash., D) Access the commit stash data with `git stash`.");
answers.add("B) Use the `diff-tree` command with the commit hash.");

// UNCHECKED

//questions.add(" What files is this .gitignore programmed to leave out? ```shell #.swift build/ *.txt *.metadata");
//options.add("A) All files with a .swift .txt or metadata file extension as well as the entire build directory, B) Only the build directory, C)All files in the build directory as well as files ending with .txt or .metadata, D) Only files with .swift and .txt extensions.");
//answers.add("C) All files in the build directory, as well as files ending with .txt or .metadata");
//
//questions.add(" After you make changes to a local repository, you run the following command. What will this do? git commit -a -m (Refactor code base)`");
//options.add("A) Nothing you can't use multiple options in the same command, B) Adds all new files to the staging area, C) Commits all new files with a message, D) Adds all modified files to the staging area then commits them with a message");
//answers.add("C) Adds all modified files to the staging area, then commits them with a message");
//
//questions.add(" After checking your git status you get the following output, which shows the file beta-notes.js in the commit but also unstaged. How can this situation occur?```shell Change to be committed:(use (git reset HEAD <file>)... to unstage) modified: beta-notes.js Changes not staged for commit: (use (git add <file>...) to update what will be committed) (use (git checkout --<file>...) to discard changes in working directory) modified: beta-notes.js");
//options.add("A) , B) There were two copies of beta-notes.js but one was deleted, C)beta-notes.js was staged then modified afterwards creating two different versions of the file, D) Two copies of beta-notes.js were created but only one is being tracked");
//answers.add("C) beta-notes.js was staged, then modified afterwards, creating two different versions of the file");
//
//questions.add(" Where are files stored before they are committed to the local repository?");
//options.add("A) Saved files, B) git documents, C)Staging area, D) git cache");
//answers.add("C) Staging area");
//
//questions.add(" You find that your project has a tag and branch both named push-notifications, which causes confusion when trying to print out given reference. How can you specify which branch you want to look at?");
//options.add("A) use git show refs/push-notifications, B) use git show push-notifications, C) use git show heads/refs/push-notifications, D) use git show refs/heads/push-notifications");
//answers.add("C) use git show refs/heads/push-notifications");
//
//questions.add(" Your team lead needs a list of all commits that will be moved before you perform a rebase. Which command can you use to access that information?");
//options.add("A) git rebase -log, B)git rebase -i, C) git rebase -verbose, D) git rebase -all");
//answers.add("C) git rebase -i");
//
//questions.add(" What is the operation doing given the Git commands below? ```git bisect start git bisect bad 5d41402abc4b2a76b9719d911017c592git bisect good 69faab6268350295550de7d587bc323d");
//options.add("A) , B) It runs a merge of a good commit that is discovered using a known bad commit and known good commit, C) It marks a commit for deletion using a known bad commit and known good commit to determine which commit introduced a bug, D) It defines a bad commit and resets the HEAD using a known bad commit and known good commit");
//answers.add("C) It performs a binary search using a known bad commit and known good commit to determine which commit introduced a bug");
//
//questions.add(" In a situation where you have several commits for a single task, what is the most efficient way to restructure your commit history?");
//options.add("A) Cherry pick the related commits to another branch., B) Delete the task commits and recommit with a new message., C)Squash the related commits together into a single coherent commit., D) Stash the related commits under a new hash.");
//answers.add("C) Squash the related commits together into a single coherent commit.");
//
//questions.add(" Which of the following is true of the git push command? **Note:** Which statement is true of the `git push` command?");
//options.add("A) By default a push doesn't send tags to the remote repository., B) Commits can only be tagged when they are created., C) Tags are pushed to the remote repository with their respective commits., D) Only annotated tags are automatically pushed to the remote repository with a commit.");
//answers.add("C) By default a push doesn't send tags to the remote repository.");
//
//questions.add(" After pushing commits to the remote repository for the first time using the command below, what shorthand command can you use in future?```bashgit push -u origin master");
//options.add("A) , B) git push master, C) git push origin, D) Same as before git push -u origin master");
//answers.add("C) git push");
//
//questions.add(" How would you create a custom shortcut or command across your Git environment?");
//options.add("A) Run `git hotfix` with the shortcut name., B) Assign a shortcut or command using git options file., C) Use the `git custom-key` command., D) Create an alias using the `git config` command.");
//answers.add("C) Create an alias using the `git config` command.");
//
//questions.add(" What command would let you modify your previous commit?");
//options.add("A) --fix, B) --quickfix, C) --modify, D) --amend");
//answers.add("C) --amend");
//
//questions.add(" What is the best way to characterize the git commit structure?");
//options.add("A) Data array, B) Data log, C)Data snapshot, D) Data dictionary");
//answers.add("C) Data snapshot");
//
//questions.add(" What change will the following command make to the staging area files? git rm --cached testfile.js`");
//options.add("A) testfile.js will be removed from the staging area and its changes no longer tracked., B) testfile.js will be removed from the staging area but its changes will still be tracked., C) A copy of testfile.js will be cached on your desktop., D) The current copy of testfile.js will be saved in the staging area.");
//answers.add("C) testfile.js will be removed from the staging area and its changes no longer tracked.");
//
//questions.add(" After you've successfully merged two branches and committed the changes, what is the next step in keeping your git structure organized?");
//options.add("A) Use the git reset --soft HEAD to roll back one commit., B)Run git branch -d `<branch name>` to delete the merged branch., C) Use git clear-all to clean up any hanging files., D) Run git rebase to move the current commit to its original location.");
//answers.add("C) Run git branch -d `<branch name>` to delete the merged branch.");
//
//questions.add(" While modifying a file, you're unexpectedly assigned an urgent bug fix on another branch. How can you temporarily save your local work without committing?");
//options.add("A) This is not possible as you cannot save locally without committing., B) Run git hold to save a local copy of what you're doing to return to later., C) Save your work with git local-cache., D) Use git stash to save your work and come back later and reapply the stashed commit.");
//answers.add("C) Use git stash to save your work and come back later and reapply the stashed commit.");
//
//questions.add(" What command would you use to create a new git repository?");
//options.add("A) git add, B) git start, C) git new, D) git init");
//answers.add("C) git init");
//
//questions.add(" While working on a feature branch you try to use (git rerere) to solve a recurring merge conflict but nothing is happening. What could be causing this issue?");
//options.add("A) The (-all) option isn't added to the command., B)(rerere.enabled) isn't enable in the config file., C) The commit hash is missing., D) The filepath isn't specified.");
//answers.add("C) (rerere.enabled) isn't enable in the config file.");
//
//questions.add(" Which setting determines what pager is used when Git pages output?");
//options.add("A) core.page, B) page, C) pager, D) core.pager");
//answers.add("C) core.pager");
//
//questions.add(" What does commit object contain?");
//options.add("A) A set of files representing the state of a project at a given point of time., B) Reference to parent commit objects., C) An SHA1 name a 40-character string that uniquely identifies the commit object., D) Reference to parent commit objects and a set of files representing the state of a project at a given point of time and an SHA1 name a 40-character string that uniquely identifies the commit object.");
//answers.add("C) Reference to parent commit objects and a set of files, representing the state of a project at a given point of time, and an SHA1 name, a 40-character string that uniquely identifies the commit object.");
//
//questions.add(" Which option enables inclusion of committer name in custom log format?");
//options.add("A) %ce, B) %cr, C) %cd, D) %cn");
//answers.add("C) %cn");
//
//questions.add(" How many ways are present in Git to integrate changes from one branch into another?");
//options.add("A) 3, B) 5, C)2, D) 4");
//answers.add("C) 2");
//
//questions.add(" Which user should be created first during setting up of SSH?");
//options.add("A) git, B) admin, C) root, D) None of these");
//answers.add("C) None of these");
//
//questions.add(" Which command will list tags with the 1.4.2 series?");
//options.add("A) git tag 'v1.4.2', B)git tag -l 'v1.4.2.*', C) git tag-list 'v1.4.2*', D) git tag 'v1.4.2*'");
//answers.add("C) git tag -l 'v1.4.2.*'");
//
//questions.add(" Which of the following is an integration manager?");
//options.add("A) lieutenants, B) benevolent dictator, C)Depends upon project type, D) Depends upon data");
//answers.add("C) Depends upon project type");
//
//questions.add(" Which Git command begins tracking of a new file?");
//options.add("A) add, B) addfile, C) begin, D) track");
//answers.add("C) add");
//
//questions.add(" Which of the following is called dumb protocol?");
//options.add("A) All of these, B) SSH, C) Git, D) HTTP");
//answers.add("C) HTTP");
//
//questions.add(" Which key press returns a set of suggestions to pick from, when writing a Git command?");
//options.add("A) Control, B) Shift, C)Tab, D) Alt");
//answers.add("C) Tab");
//
//questions.add(" Which of these terms best describes Git?");
//options.add("A) Distributed Version Control System, B) Issue Tracking System, C) Integrated Development Environment, D) Web-Based Repository Hosting Service");
//answers.add("C) Distributed Version Control System");
//
//questions.add(" How does Git think of its data?");
//options.add("A) File, B) None of these, C)Snapshot, D) Folder");
//answers.add("C) Snapshot");
//
//questions.add(" Which option enables inclusion of author name in custom log format?");
//options.add("A) %am, B) %ad, C) %ae, D) %an");
//answers.add("C) %an");
//
//questions.add(" Which version onwards did Git offer reversing a file back to what it looked like when last committed?");
//options.add("A) 1.7, B)1.6, C) 2.0, D) 1.8");
//answers.add("C) 1.6");
//
//questions.add(" Which strategy is used by Git for merging two branches?");
//options.add("A) LIFO, B) recursive, C) FIFO, D) octopus");
//answers.add("C) octopus");
//
//questions.add(" What does refs store?");
//options.add("A) SHA-1 value, B) None of these, C)Branch name, D) Project name");
//answers.add("C) Branch name");
//
//questions.add(" What Language is used in GIT?");
//options.add("A) C, B) C++, C) C#, D) Java");
//answers.add("C) C");
//
//questions.add(" What is usually the extension of file which has the public key?");
//options.add("A) ssh, B)pub, C) key, D) pk");
//answers.add("C) pub");
//
//questions.add(" What is the difference between initializing a normal repo and a bare repo?");
//options.add("A) Bare repos store their git history in a .git subfolder., B) Bare repos do not have the .git extension., C)Bare repos do not come with working or checked-out source files., D) Bare repos should be used for local rather than remote repos.");
//answers.add("C) Bare repos do not come with working or checked-out source files.");
//
//questions.add(" How many individual commits can a single repository have?");
//options.add("A) any number of commits, B) only one commit local per repository, C) only three commits per branch, D) only one commit per HEAD");
//answers.add("C) any number of commits");
//
//questions.add(" What types of tags does Git support?");
//options.add("A) heavy and concise, B) lightweight and immutable, C) heavy and annotated, D) lightweight and annotated");
//answers.add("C) lightweight and annotated");
//
//questions.add(" series of changes to the index, which command could you use to review them prior to a commit?");
//options.add("A) git diff --cached, B) git diff, C) git diff --HEAD, D) git status -v -v");
//answers.add("C) git diff --cached");
//
//questions.add(" What does the git stash drop command do?");
//options.add("A) removes the most recent stash entry, B) deletes the stash, C) lists everything in the stash, D) throws away the oldest entry");
//answers.add("C) removes the most recent stash entry");
//
//questions.add(" What happens if you run this command from your master branch? ```bash git checkout -b beta-test");
//options.add("A) , B) The beta-test branch will be checked out of the current commit., C) The beta-test branch will be checked out and deleted., D) A new branch called beta-test will be created and switched to.");
//answers.add("C) A new branch called beta-test will be created and switched to.");
//
//questions.add(" How does Git internally manage branches?");
//options.add("A) by creating a pointer to the most recent snapshot/commit for the branch., B) by creating a data array of branches in the same repository., C) by creating a data dictionary of code changes., D) be creating a debug log that stores repository changes.");
//answers.add("C) by creating a pointer to the most recent snapshot/commit for the branch.");
//
//questions.add(" You want to perform a git reset but cannot recall all of the available options. What command would you use to see a description of them?");
//options.add("A) git help reset, B) git -h reset, C) git options reset, D) git reset help");
//answers.add("C) git help reset");
//
//questions.add(" What is a remote repository?");
//options.add("A) a version of the repository that mirrors changes made in the local repository's master branch for open-source collaboration efforts, B) the lead repository elected by the Git arbitrator found within local repositories of collaborating team members, C) a read-only version of the repository stored on a backup server in case local repositories become lost or corrupted, D) a version of the repository hosted on the internet or network that is pushed to or pulled from by collaborators");
//answers.add("C) a version of the repository hosted on the internet or network that is pushed to or pulled from by collaborators");
//
//questions.add(" After modifying some existing files in a repository, you decide to discard the changes. What command can you use?");
//options.add("A) git restore, B) git undo, C) git clean, D) git checkout .");
//answers.add("C) git checkout .");
//
//questions.add(" After starting to merge a feature branch into your master branch, you encounter a merge conflict and decide you do not want to perform the merge. How can you stop the merge and restore to the pre-merge state?");
//options.add("A) Use git restore -p., B) Use git merge -u., C)Use git merge --abort., D) Use git merge --undo.");
//answers.add("C) Use git merge --abort.");
//
//questions.add(" What is the main issue with using git rebase when working with multiple developers?");
//options.add("A) Rebase affects only your repository and creates a diff in the master branch., B) Rebase creates a temporary copy of the master branch in the remote repo., C) Rebase moves the HEAD of the remote master branch one commit forward., D) Rebase deletes all commit history for the new feature branch.");
//answers.add("C) Rebase affects only your repository and creates a diff in the master branch.");
//
//questions.add(" What Git workflow is used by teams that collaborate on a single branch and avoid creating long-lived development branches?");
//options.add("A) Git flow, B)Mainline flow, C) Trunk-Based Development, D) GitHub flow");
//answers.add("C) Mainline flow");
//
//questions.add(" Which option on the git log command allows you to limit output to commits made after certain date?");
//options.add("A) `--since`, B) `--sinceWhen`, C) `-<n>`, D) `--afterDate`");
//answers.add("C) `--since`");
//
//questions.add(" How would you delete unreachable objects older than a specified time from your project database?");
//options.add("A) `git cache --obsolete <time>`, B) `git branch --rebase <time>`, C) `git delete --inert <time>`, D) `git prune --expire <time>`");
//answers.add("C) `git prune --expire <time>`");
//
//questions.add(" What conflicts can occur when forcing a push after rebasing?");
//options.add("A) The remote master branch could have existing changes overwritten., B) The origin URL will be reset to its default value., C) The current HEAD will be deleted and can't be reinstated., D) Nothing it's common practice to force a push after rebasing.");
//answers.add("C) The remote master branch could have existing changes overwritten.");
//
//questions.add(" What is the difference between Git and SVN?");
//options.add("A) Git works only on Linux while SVN works on all operating systems., B) SVN works only on Linux while Git works on all operating systems., C)SVN is a centralized system while Git is a distributed system., D) Git a centralized system while SVN is a distributed system.");
//answers.add("C) SVN is a centralized system, while Git is a distributed system.");
//
//questions.add(" This command is an example of what kind of tag? `git tag -a v1.4 -m (ABCD v1.5)`");
//options.add("A) verbose, B)annotated, C) lightweight, D) deferred");
//answers.add("C) annotated");
//
//questions.add(" What is the difference between a soft reset (`git reset --soft`) and a hard reset (`git reset �hard`) ?");
//options.add("A) A soft reset only changes the commit that HEAD points to while a hard reset resets the index and working tree to match the specified commit discarding any changes., B) A soft reset caches the old HEAD pointer while a hard reset deletes it entirely., C) A hard reset changes only where the HEAD is pointing while a soft reset changes the HEAD and index., D) A hard reset caches the old HEAD pointer while a soft reset deletes it entirely.");
//answers.add("C) A soft reset only changes the commit that HEAD points to, while a hard reset resets the index and working tree to match the specified commit, discarding any changes.");
//
//questions.add(" Which of the following options is correct ?");
//options.add("A) `1. Develop 2. Release 3. Hotfix 4. Feature 5. Master`, B) `1. Master 2. Release 3. Hotfix 4. Feature 5. Develop`, C) `1. Develop 2. Master 3. Hotfix 4. Feature 5. Develop`, D) `1. Master 2. Hotfix 3. Develop 4. Feature 5. Release`");
//answers.add("C) `1. Master 2. Hotfix 3. Develop 4. Feature 5. Release`");
//
//questions.add(" What information does the git config file store?");
//options.add("A) shell scripts and flags, B) keychain and account information, C)local and global repository options, D) pre-compile scripts and settings");
//answers.add("C) local and global repository options");
//
//questions.add(" What is version control?");
//options.add("A) a type of architecture used to manage large databases, B)a system that shows tracks and controls changes to a set of files over time, C) a programmatic design pattern used to manage code between multiple engineering teams, D) a type of software that links a project with a GitHub repository");
//answers.add("C) a system that shows, tracks, and controls changes to a set of files over time");
//
//questions.add(" What is the difference between using the `git stash` and `git stash pop` commands?");
//options.add("A) `git stash` removes a commit from the repo history while `git stash pop` saves changes to multiple branches., B) `git stash` saves changes to multiple branches while `git stash pop` removes a commit from the repo history., C) `git stash` removes the most recent commit while `git stash pop` saves current changes., D) `git stash` creates a stash entry while `git stash pop` places a saved state from the stash list onto the working directory.");
//answers.add("C) `git stash` creates a stash entry, while `git stash pop` places a saved state from the stash list onto the working directory.");
//
//questions.add(" Which command can be used to list the branches that have been merged into the currently checked-out branch?");
//options.add("A) git master --status, B) git branch --status, C)git branch --merged, D) git status --merged");
//answers.add("C) git branch --merged");
//
//questions.add(" How would you configure Git to abort a commit if a smoke test script fails?");
//options.add("A) Create a post-commit shell script that triggers the action., B) Create a post-commit hook to trigger the script., C)Create a pre-commit hook to trigger the script., D) Create a pre-commit shell script that triggers the action.");
//answers.add("C) Create a pre-commit hook to trigger the script.");
//
//questions.add(" Which use case is NOT a good candidate for a Git hook?");
//options.add("A) state dependent environment changes, B) continuous integration, C) increasing code coverage, D) enforcing commit rules");
//answers.add("C) state dependent environment changes");
//
//questions.add(" What information do Git reflogs (reference logs) store?");
//options.add("A) shell script pointers and keychain credentials, B)updates to branch tips and other references in the local repository, C) release notes and hook script values, D) tag and versioning information");
//answers.add("C) updates to branch tips and other references in the local repository");
//
//questions.add(" You have just completed rebasing your master branch and need to manually update the remote master, even though there is a merge conflict. How can you accomplish this?");
//options.add("A) `git push --overwrite`, B) `git push --update`, C) `git push --assert`, D) `git push --force-with-lease`");
//answers.add("C) `git push --force-with-lease`");
//
//questions.add(" What is the difference between `git fetch` and `git pull`");
//options.add("A) `git fetch` creates a new branch off the master branch while `git pull` creates a new branch off the local repository's master branch., B) `git pull` downloads new data from a remote repository without integrating it into local files while `git fetch` updates the current HEAD branch with the latest changes from the remote server., C)`git fetch` updates remote tracking branches with changes from a remote repository while `git pull` updates remote tracking branches with changes from a remote repository and merges them into their corresponding local branches., D) `git fetch` downloads and merges data from the local repository while `git pull` informs your colleagues you are about to make changes to the master branch.");
//answers.add("C) `git fetch` updates remote tracking branches with changes from a remote repository, while `git pull` updates remote tracking branches with changes from a remote repository and merges them into their corresponding local branches.");
//
//questions.add(" What command displays the difference between the working tree and the stage/index area, as well as files not tracked by Git?");
//options.add("A) `git current`, B)`git status`, C) `git local`, D) `git context`");
//answers.add("C) `git status`");
//
//questions.add(" You would like to restore some previously stashed work to a new branch. How can you do that?");
//options.add("A) Use `git branch <stash hash>`., B) Add the stashed commits to the current commit then create a new branch., C) Use `git checkout -b`., D) Run `git stash branch <branch name>`.");
//answers.add("C) Run `git stash branch <branch name>`.");
//
//questions.add(" What is the difference between git branch -d and git branch -D?");
//options.add("A) -D deletes the local branch while -d deletes the branch regardless of push and merge status., B) -d deletes the current commit head while -D deletes the entire branch., C)-d deletes the local branch while -D deletes the local branch regardless of push and merge status., D) -D deletes the current commit head while -d deletes the entire branch.");
//answers.add("C) -d deletes the local branch, while -D deletes the local branch regardless of push and merge status.");
//
//questions.add(" You stashed three sets of changes but cannot remember the contents of the first stash entry. What command would you use to see the details of the changes in the first of the three stash entries?");
//options.add("A) git stash show -p stash@{2}, B) git stash list, C) git stash show -p stash@{1}, D) git stash show -p");
//answers.add("C) git stash show -p");
//
//questions.add(" How would you delete a remote branch in your repository?");
//options.add("A) Use `git --delete <branch_name>`., B) Use `git push <remote_name> --d <branch_name>`., C) Use `git push <remote_name> --D`., D) Use `git push <remote_name> --delete <branch_name>`.");
//answers.add("C) Use `git push <remote_name> --delete <branch_name>`.");
//
//questions.add(" What is the default setting of `git reflog` when no subcommands are specified?");
//options.add("A) delete, B) expire, C)show, D) update");
//answers.add("C) show");
//
//questions.add(" How does the `-p` option change the behavior of the `git add` command");
//options.add("A) It causes tracked files in the parent directory to be included in the staged files., B)It allows developers to interactively choose which changes to tracked files are staged and outputs the differences for review., C) It automatically pushes changes to the corresponding branch on the remote repository., D) It allows developers to interactively choose which files are committed and outputs the differences for review.");
//answers.add("C) It allows developers to interactively choose which changes to tracked files are staged and outputs the differences for review.");
//
//questions.add(" After checking out a specific commit, you receive a warning message indicating You are in 'detached HEAD' state. What is Git warning you of?");
//options.add("A) You are not working on the most recent commit of a branch., B) A teammate has flagged the code with an issue., C)The commit does not have a parent., D) The branch has not been pushed to the remote repository.");
//answers.add("C) The commit does not have a parent.");

questions.add(" After accidentally deleting a branch in your local repository, how can you recover it?");
options.add("A) It cannot be recovered., B) Find the hash of the branch with the `log` command then execute `git checkout -b <branchname> <hash>`., C)Find the hash of the branch with the `reflog` command then execute `git checkout -b <branchname> <hash>`., D) Execute `git checkout -b <branchname>`.");
answers.add("B) Find the hash of the branch with the `reflog` command, then execute `git checkout -b <branchname> <hash>`.");

questions.add(" How would you display a histogram showing inserts, deletion, and modifications per file for a specific commit along with its general commit information?");
options.add("A) Use `git stat`., B) Use `git debug --prettyprint`., C) Query the remote repository with the commit hash., D) Use `git show <commit> --stat`.");
answers.add("D) Use `git show <commit> --stat`.");

questions.add(" What features do repository managers such as GitHub provide beyond Git?");
options.add("A) Repository managers are proprietary versions of Git that do not include enhanced features., B) Repository managers provide an enhanced command-line tool that is used to manage multiple local repositories., C) Repository managers provide an online service for hosting Git repositories that include collaboration features such as pull requests issue tracking and peer reviews., D) Repository managers distribute repositories across multiple locations on a user's workstation providing redundant storage that allows for quick backup and recovery.");
answers.add("C) Repository managers provide an online service for hosting Git repositories that include collaboration features such as pull requests, issue tracking, and peer reviews.");

questions.add(" What command finds the HEAD of the current branch?");
options.add("A) `git head --verify`, B) `git log --head`, C) `git hash --head`, D) `git show-ref --head`");
answers.add("D) `git show-ref --head`");

questions.add(" Long-running branch, what purpose does the long-running branch serve?");
options.add("A) Long-running branches store unstable code until it os peer reviewed for integration into a feature branch., B) Long-running branches correspond to agile sprints and are used to store related to features developed in the sprint., C) Long-running branches contain code related to experimental feature development that is merged into short-lived branches such as master., D) Long-running branches correspond to different stages of development and are always open for topic/feature branches to be pulled into.");
answers.add("D) Long-running branches correspond to different stages of development and are always open for topic/feature branches to be pulled into.");

questions.add(" What command takes changes from the master branch on the remote repository origin and merges then to the local checked-out branch?");
options.add("A) `git commit -u origin`, B) `git checkout origin`, C)`git pull origin master`, D) `git push origin master`");
answers.add("C) `git pull origin master`");

questions.add(" What does the -p option add to the output of the `git log` command?");
options.add("A) It adds patch output that shows the differences introduced in each commit., B) It adds patch output that shows a summary listing modified files., C) It adds padding to the output and displays a histogram showing the number of lines changed in each commit., D) It adds the full commit message and notes associated with each commit.");
answers.add("A) It adds patch output that shows the differences introduced in each commit.");

questions.add(" What is the staging area or index?");
options.add("A) an area that stores commits prior to them being pushed to the remote repository, B) an area containing stash entries that can applied to the working files, C) an area where changes from a branch in the remote repository are stored before they are applied to a local branch, D) an area that stores information about changes that will be included in the next commit");
answers.add("D) an area that stores information about changes that will be included in the next commit");

questions.add(" What command would you use to stage changes to the index strictly for properties files in the current directory?");
options.add("A) `git add *.properties`, B) `git add %.properties`, C) `git add .properties`, D) `git add properties`");
answers.add("C) `git add *.properties`");

questions.add(" What are untracked files?");
options.add("A) files in the local repository that have not been merged into the master branch, B) staged files that Git does not know about because the have not been committed, C) files in the working directory that Git does not know about because they have not been staged or committed, D) files in the remote repository that Git does not know about because they have not been tagged");
answers.add("C) files in the working directory that Git does not know about because they have not been staged or committed");

questions.add(" What type of Git hook could be used to validate that a commit message contains a ticket number?");
options.add("A) pre-commit, B) commit-msg, C) applypatch-msg, D) prepare-commit-msg");
answers.add("B) commit-msg");

questions.add(" What is the difference between git stash pop and git stash apply?");
options.add("A) git stash pop pushes the topmost commit to the current branch while git stash apply caches the last commit in the current branch., B) git stash pop applies the topmost entry in the stash to the working files and removes it from the stash while git stash apply applies the topmost entry in the stash to the working files but leaves it in the stash., C) git stash pop merges the topmost commit to the current branch while git stash apply merges the last commit in the current branch., D) git stash pop applies the topmost entry in the stash to the working files but leaves it in the stash while git stash apply applies the topmost entry in the stash to the working files and removes it from the stash.");
answers.add("D) git stash pop applies the topmost entry in the stash to the working files and removes it from the stash, while git stash apply applies the topmost entry in the stash to the working files but leaves it in the stash.");

questions.add(" After making some major changes to your code, you are a little nervous about committing. What command would you use to review the commit prior to making it?");
options.add("A) git commit --verify, B) git notes show, C) git commit preview, D) git commit --dry-run");
answers.add("D) git commit --dry-run");

questions.add(" What statement best describes Git's concept of HEAD?");
options.add("A) a pointer to the most recently changed file in the stage/index, B) a pointer to the master branch, C) a pointer to the most recent commit in the currently checked-out branch, D) a pointer to where the repository is stored in memory");
answers.add("C) a pointer to the most recent commit in the currently checked-out branch");

questions.add(" After staging changes to several files, you realize the changes to the config.properties file are incorrect, and need to be removed from the stage and working directory. What command can you use to remove the staged changes to the file?");
options.add("A) git reset HEAD^ --config.properties, B) git rm config.properties, C) git rf config.properties, D) git checkout HEAD -config.properties");
answers.add("A) git reset HEAD^ -- config.properties");

questions.add(" After a recent release with a stack trace, an issue is create that indicates the problem is with a newly added configuration property named MaxConnections. What command can find all commits that add or remove the string MaxConnections?");
options.add("A) git grep -a (MaxConnections, B) git log --search-string (MaxConnections), C) git log -S (MaxConnections, D) git commit --with (MaxConnections)");
answers.add("C) git log -S (MaxConnections)");

questions.add(" Your company has moved its remote repository to GitHub at this location: https://github.com/yourcompany/core-api.git. What command updates the remote repository, named origin, to point to the new remote repository at this location?");
options.add("A) git remote create-update origin https://github.com/yourcompany/core-api.git, B) git remote update origin https://github.com/yourcompany/core-api.git, C) git remote set-url origin https://github.com/yourcompany/core-api.git, D) git remote add https://github.com/yourcompany/core-api.git");
answers.add("C) git remote set-url origin https://github.com/yourcompany/core-api.git");

questions.add(" When is the cherry-pick command used?");
options.add("A) when a commit from one branch needs to be copied into another branch, B) when the HEAD needs to be reset to a specific commit, C) when a specific commit needs to be pulled down from the remote repository, D) when a hook script needs to be invoked");
answers.add("A) when a commit from one branch needs to be copied into another branch");

questions.add(" How would you describe a forked repository?");
options.add("A) a deleted or archived copy of a repository, B) a beta release branch of a repository, C) a future branch of a repository, D) a separate copy of a repository");
answers.add("D) a separate copy of a repository");

questions.add(" What would happen if you ran the `git reset testfile.js` command?");
options.add("A) testfile.js would be reverted to a blank file., B) testfile.js would be reset to its first saved state., C) testfile.js would be reverted to its last saved copy., D) testfile.js would be removed from the stage/index area if present.");
answers.add("C) testfile.js would be reverted to its last saved copy.");

questions.add(" What practice can help reduce the chances of encountering a merge conflict?");
options.add("A) Provide detailed commit messages that describe the changes being introduced by the commit., B) make large commits that introduce multiple features., C) Keep local repository branches in sync with upstream branches in the remote repository by committingpushing and pulling frequently., D) Avoid frequent interaction with the remote repository to reduce the probability of pulling conflicts.");
answers.add("C) Keep local repository branches in sync with upstream branches in the remote repository by committing,pushing and pulling frequently.");

questions.add(" What command can you use to remove untracked files from the working directory?");
options.add("A) `git rm -all`, B) `git rm --cached`, C) `git clean -d -f`, D) `git checkout`");
answers.add("C) `git clean -d -f`");

questions.add(" Suppose you have created a bug fix on a new branch and want it to become part of the next production build generated from the main branch. What should you do next?");
options.add("A) Copy your branch changes and commit them directly to the main branch., B) Create a pull request to merge your new branch into the main branch., C) On second thought maybe I won't share this fix. I'll just put it in my own private version of the source code., D) Use git bisect to compare the buggy commit to an early commit that works as expected.");
answers.add("B) Create a pull request to merge your new branch into the main branch.");

questions.add(" What is GitHub?");
options.add("A) version control, B) A hosting platform for Git repositories, C) for keeping images, D) for social networking");
answers.add("B) A hosting platform for Git repositories");

questions.add(" Git Pull is a combination of?");
options.add("A) Add and commit., B) branch and checkout., C) fetch and merge., D) None of these.");
answers.add("C) fetch and merge.");

questions.add(" What is the command to set the user email for the current repository?");
options.add("A) git email.user, B) git config user.email, C) git config email, D) All of the above.");
answers.add("B) git config user.email");

questions.add(" ____ will rewind your project to a specific point in time, losing all commits that came after it. ______ will keep changes in those rewound commits as local modifications");
options.add("A) git reset HEAD`; `git reset HEAD^`, B) `git reset --hard`; `git reset --soft`, C) `git reset --soft`; `git reset --hard`, D) `git rewind`; `git update`");
answers.add("B) `git reset --hard`; `git reset --soft`");

questions.add(" Explain the concept of (Git blame) and when it is used in a version control workflow.");
options.add("A) Git blame is a command for finding and exposing the identity of contributors in a Git repository., B) It's used for blaming others for code issues in a collaborative project., C) Git blame is a feature for tracking the location of bugs in code., D) Git blame is a tool for displaying who last modified each line of a file helping to track changes and understand code history and authorship.");
answers.add("D) Git blame is a tool for displaying who last modified each line of a file, helping to track changes and understand code history and authorship.");

questions.add(" What is the purpose of C++ move constructor, and when is it automatically generated?");
options.add("A) A move constructor creates deep copies of objects improving memory efficiency., B) It is generated when you explicitly define a copy constructor., C) The move constructor is used for copying objects between different data types., D) A move constructor allows efficient transfer of resources from one object to anotherreducing unnecessary copying.");
answers.add("D) A move constructor allows efficient transfer of resources from one object to another,reducing unnecessary copying.");

questions.add(" What is  Github marketplace. why is it importance to create a release?");
options.add("A) to alow you to create .zip files that you can easily share, B) to initiate a continuos integration process, C)to package your software so that it can become available through the Github marketplace, D) to create workflows and automate the process of generating software");
answers.add("A) to alow you to create .zip files that you can easily share");

questions.add(" You're looking at a repository page and click a folder name to open it. You have code search on, so you land in the code view. What is the quickest way to find a file on a path in your repo?");
options.add("A) Press the slash(/) key and then the T key., B) Go to advanced search., C) From the search menu select Path., D) Press the T key.");
answers.add("A) Press the slash(/) key and then the T key.");

questions.add(" How do you save a search that you use often using GitHub?");
options.add("A) Click Save on the Search box., B) Click Save in the advanced search menu., C) Click Save on the search results page., D) Bookmark the search results page.");
answers.add("C) Click Save on the search results page.");

questions.add(" which of these is not a label that github creates by default?");
options.add("A) bug, B) documentation, C) wontfix, D) repo");
answers.add("D) repo");

questions.add(" What is the fastest way to start a search using Github web pages?");
options.add("A) Press the slash(/) key on any page of the site., B) Click the Search tab from the Github Version, C) Click the advanced Search link., D) Click the search box and type your searc query.");
answers.add("D) Click the search box and type your searc query.");

questions.add(" Assigning an issue to a person implies that they __________.");
options.add("A) will get a notification asking them to review the issue, B) are responsible for resolving the issue, C) are being informed of the issue's details, D) supervise the team resolving the issue");
answers.add("B) are responsible for resolving the issue");

questions.add(" You're creating an action for the GitHub Marketplace. Why is it important to create a release?");
options.add("A) To allow you to create .zip files that you can easily share, B) To initiate a continuous integration process, C) To package your software so that it can become available through the Github Marketplace, D) To create workflows and automate the process of generating software");
answers.add("C) To package your software so that it can become available through the Github Marketplace");

questions.add(" What are two ways to help Copilot give you more accurate suggestions?");
options.add("A) Add instructions in parentheses., B) Use shorthand but accurate descriptors., C) Add context in comments., D) Use concise variable names.");
answers.add("C) Add context in comments.");

questions.add(" While doing a code review, you want to start an issue by highlighting a function that takes up several lines of code. What is the fastest way to do this in code view?");
options.add("A) Click the first line number with the function click the last line number to select a range then in the hamburger menu select Reference in new issues, B) Copy the code and start a new issue then use backticks around the function to create the issue, C) Select the function with the mouse then right click and select reference in new issue, D) Click the line number with the function and select reference function in an issue");
answers.add("C) Select the function with the mouse, then right click and select reference in new issue");

questions.add(" You're reviewing a file in a repository and want to link to the current version of the file, even if it gets updated later. How can you achieve this?");
options.add("A) Go to the Code tab and click Download zip, B) Right click the code text and select Permalink, C) Click Permalink on the code view, D) Copy the URL from the address bar");
answers.add("C) Click Permalink on the code view");

questions.add(" You're organizing a desktop application project. You want to use an overview f your project statuses and be able to drag and drop issues. Which view would you use?");
options.add("A) Board, B) Overview, C) Roadmap, D) Table");
answers.add("A) Board");

questions.add(" You re in the repo for a specific project while working on an app module. You want to look for some of the docs you�ve been working on, which you wrote in markdown. To quickly look in your own repo for all files with a markdown extension, press the slash ('/') button on the keyboard while on the repository page and type ___.");
options.add("A)Path:.md, B)Grep:.md, C)Code:*.md, D)Ext:*.md");
answers.add("C)Code: *.md");

questions.add(" In GitHub Projects, how can you assign an issue to a collaborator?");
options.add("A) Label the item with their username., B) Select their username from the Assignees field., C) Move the item to their column in the Boards view., D) Add their handle in the comments.");
answers.add("B) Select their username from the Assignees field.");

questions.add(" Why should you include a descriptive function name when writing code with Copilot?");
options.add("A) It helps Copilot add more variables to a function., B) It trains the algorithm for the next time a GitHub client answers the question., C) It helps Copilot have better context for code assistance and generation., D) The function names are not fed to Copilot and are ignored by the AI.");
answers.add("C) It helps Copilot have better context for code assistance and generation.");

questions.add(" You are working on a project that uses a Python library and you want to find an example of how to use a function across all public repositories. Which part of GitHub's platform would you use?");
options.add("A) Issues., B) Discussions, C) Projects, D) Search");
answers.add("D) Search");

questions.add(" Working late on a project, you need to find an issue that was assigned to you. What query do you type?");
options.add("A) Is:issue assignee:username, B) Is:issue user:username, C) Issue:issue user:username, D) assignee:username is:rep");
answers.add("A) Is:issue assignee:username");

questions.add(" you are working on an AI app and need to add information on project tables about the AI model being targeted. What feature allows you to do this?");
options.add("A) Custom fields, B) Comments, C) Pull requests, D) Custom properties");
answers.add("A) Custom fields");

questions.add(" What feature does the shortcut /table activate when used inside a GitHub comment section?");
options.add("A) A data visualization table, B) A markdown table structure, C) An HTML table structure, D) A table of contents");
answers.add("B) A markdown table structure");

questions.add(" What does the RUN command do in a Dockerfile?");
options.add("A) It allows you to specify which type of machine to procure., B) It helps run your workflows., C) It fires up an additional container, D) It allows you to execute a shell command during the image generation process");
answers.add("D) It allows you to execute a shell command during the image generation process");

questions.add(" How can you ensure that you are matching an exact combination of words?");
options.add("A) Enclose your query in parentheses, B) Use the exact: qualifier, C) Put the series of words in quotes, D) Add the AND operator to the end of your query");
answers.add("C) Put the series of words in quotes");

questions.add(" What is the main function of the Entrypoint instruction in a Dockerfile?");
options.add("A) It gives instructions to the Docker container to follow before it loads, B) It executes a script when the docker container starts., C) It serves as the first file that an editor opens when it loads the container., D) It indicates a specific command to be run during the Docker image build process");
answers.add("B) It executes a script when the docker container starts.");

questions.add(" Inside a GitHub action, which keyword do you use to specify the operating system to run jobs?");
options.add("A) Hardware, B) Runs-on, C) Machine, D) Os");
answers.add("B) Runs-on");

questions.add(" How can you get additional context from other files in your code?");
options.add("A) Right-click a file and add it to context, B) Open additional tabs with some of your codes; they will be in Copilot context, C) Create a comment with the list of files you want Copilot to have context from, D) Highlight the files you want to add context to form the file sidebar");
answers.add("B) Open additional tabs with some of your codes; they will be in Copilot context");

questions.add(" When creating a release, which of these would count as a valid release format?");
options.add("A) *3.2.4, B) @3.2.4, C) #3.2.4, D) V3.2.4");
answers.add("D) V3.2.4");



    }
    
    
    public static void main(String[]args){
        new GitBash_Quiz(name).setVisible(true);
    }
    
}

