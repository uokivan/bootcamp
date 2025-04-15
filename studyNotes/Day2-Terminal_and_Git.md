# Day 2 - Terminal and Git  
  
## Very Helpful keyboard commands for Terminal  
> [!NOTE]  
> Up Arrow : Will show your last command  
> Down Arrow : Will show your next command  
> Tab : Will auto-complete your command  
> Ctrl + L : Will clear the screen  
> Ctrl + C : Will cancel a command  
> Ctrl + R : Will search for a command  
> Ctrl + D : Will exit the terminal  
  
  
# Some Basic Terminal Command  
> [!TIP]  
> Ref : https://gist.github.com/bradtraversy/cc180de0edee05075a6139e42d5f28ce  
  
Lists the path to the working directory :
```
pwd
```  
  
List directory contents :
```
ls
```  
  
Change directory to home :
```
cd
```    
  
Change directory to specific directory :
```
cd [dirname]
```    
  
Change to parent directory :
```
cd..
```  
  
# Git  
> [!TIP]  
> Tip 1 : Git Commands  
> Ref : https://dzone.com/articles/top-20-git-commands-with-examples  
> Ref : https://education.github.com/git-cheat-sheet-education.pdf  

> [!TIP]  
> Tip 2 : How create a good read.md  
> Ref : https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax  
  
After ssh setup...  
  
** url come from github > ssh (can see the git url, must choose ssh, not https) **  
  
## Clone from git :  
```  
git clone https://github.com/uokivan/bootcamp.git  
```  
  
## Check any new update in local git project ? :  
```  
git status
```  
  
  
## Push local data to git :  
### Step 1. Add files to next commit  
```  
git add .
```  
  
### Step 2. Commit your staged content as a new commit snapshot  
```  
git commit -m "new update"
```  
  
### Step 3. Push your code to git  
```  
git push
```  
  