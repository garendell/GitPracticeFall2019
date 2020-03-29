package day1;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*how can I send this project to github?  first, create a git repository.
        there is a git local repository and a remote repository.
        local - on your computer. we create local repository for specific project.
          remote - then, we create the remote repository on github
          last step - connect them

          Any git project starts with one command:  git init
          This will create a local repos.  We do this init only once per project.

          Then we run the command:  git status
          to see what files can be committed.git

        In order to maintain privacy of your own files, set up a gitignore file.
        Specify that anything in your .idea folder and any *.iml file should be ignored.

        Those folder and file names being ignored will show up in gray color.  Red color
        means a file that has not been "staged" yet.
        "staging" means preparing for commit.  Any new (untracked) file in Intellij will look red first,
        (unless you have set up automatic staging.)
        Then close the gitignore file.

        Now run again the command: git status  this gives you the history of commands, and shows which files
        are committed, ready to commit, not staged, untracked, etc.

        How to commit the code??
        stage changes (prepare files for commit)  command:             git add / path/ to the file
        or, if you want to stage all of them, use dot, like this:     git add .    (gitspaceaddspacedot)



         */
    }

}
