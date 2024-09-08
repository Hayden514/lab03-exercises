1,1 When I input the git init. It output: "Reinitialized existing Git repository in /home/haydenchen/csci338/class-exercises-fall2024/lab03-exercises/.git/"

1,2 When I input the git status. It output:"
On branch main
No commits yet
Changes to be committed:
(use "git rm --cached <file>..." to unstage)
new file: README.md
"

1,3 When I input the "git add README.md" and "git commit -m "add README.md to the repository"",it output: "
[main (root-commit) 0641ba5] add README.md to the repository
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 README.md"

1,4 When I input the"git log",it output:"
commit 0641ba5ad75e85bbf2bc5cd2beb069f681dffcf7 (HEAD -> main)
Author: Zejun Chen <c8284186609@gmail.com>
Date: Fri Sep 6 15:42:15 2024 -0400

    add README.md to the repository
    "

1,5 When I input the git diff, it output:"diff --git a/README.md b/README.md
index e69de29..2a3f945 100644
--- a/README.md
+++ b/README.md
@@ -0,0 +1,24 @@"

and show me that what different between each README.md

1,6 ?
