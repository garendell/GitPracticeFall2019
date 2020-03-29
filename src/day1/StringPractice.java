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

        Now run again the command:          git status
        this gives you the history of commands, and shows which files
        are committed, ready to commit, not staged, untracked, etc.

        How to commit the code??
        stage changes (prepare files for commit)  command:             git add / path/ to the file
        or, if you want to stage all of them, use dot, like this:     git add .    (gitspaceaddspacedot)

        Next, commit the code with a message, using this command:   git commit -m "my first commit"

        If you didn't ignore some files or folders, you can
        fix it using this (copy/paste from console)  command:  git rm --cached <file>
        for example git rm --cached .idea
                    git rm --chached *.iml

         After staging the files,
         COMMIT them using the commit command:   git commit -m "whatever commit message"
         Commit message should describe changes; for example, Jira issue number plus BRIEF user story.

         Summary - four commands:  init, git status, add, commit

         Then we need to create a remote repository.  copy past from github the line that says
          command:   git remote add origin https://github.com/garendell/GitPracticeFall2019.git

          [I had trouble with github sign-in, but resolved that eventually]

          Final , copy from github site, command:  git push -u origin master

          Then refresh github, you should see your commit there.

          Summary of steps to create a git project:
          git init
          create .gitignore file   ignore.idea and *.iml   Close file.
          git add
          git commit -m "message"
          git remote add origin https://github.com/ my name, name of project, .git
          git push -u origin master


         */
    }

}
