# Lab 03: Git and GitHub

This repository documents my practice with local Git, GitHub, branches, and pull requests.

## README Responses

### 1.1 After initialization

(base) haydenchen@DESKTOP-GES79IS:~/csci338/lab03-exercises$ ls -la
total 12
drwxr-xr-x 3 haydenchen haydenchen 4096 Sep 3 10:34 .
drwxr-xr-x 12 haydenchen haydenchen 4096 Sep 3 10:22 ..
drwxr-xr-x 7 haydenchen haydenchen 4096 Sep 3 10:34 .git

### 1.2 First git status

(base) haydenchen@DESKTOP-GES79IS:~/csci338/lab03-exercises$ git status
On branch main

No commits yet

Untracked files:
(use "git add <file>..." to include in what will be committed)
README.md

nothing added to commit but untracked files present (use "git add" to track)

### 1.3 After the first commit

(base) haydenchen@DESKTOP-GES79IS:~/csci338/lab03-exercises$ git status
On branch main
nothing to commit, working tree clean

### 1.4 git log

(base) haydenchen@DESKTOP-GES79IS:~/csci338/lab03-exercises$ git log --oneline
cfadb1a (HEAD -> main) Create lab README

### 1.5 git diff

Paste the `git status` and `git diff` commands and their output.

How does this `git status` differ from the one in **1.2**?

In step 1.2, README.md was an untracked file; however, the current `git status` output shows that README.md has been modified and is in a tracked but unstaged state.

### 1.6 Git command reflections

In one or two sentences each, what does each command do?

- `git init` which is used to create a git repository
- `git status` Tells you which of the files in your current directory are different from the latest commit in the repo.
- `git add` which adds a file to git's index (files about to be committed)
- `git commit` which commits the files from the index (staging area) as a new snapshot, so they are now part of the repository's history.
- `git log` Shows you the commit history
- `git diff` used to compare changes between different states of your Git repository

### 1.7 Repository link

### 1.8 Comparing approaches

In your own words:

- How does the nested-loop approach check for a duplicate?
- How does the set-based approach check for a duplicate?
- What is the runtime and memory trade-off of each?

### 1.9 Pull request merge options

In your own words, what does each GitHub merge option do?

- Create a merge commit
- Squash and merge
- Rebase and merge
