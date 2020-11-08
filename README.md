# TimeMachine-Java
Time machine in Java.

About
The TM project is designed with the purpose to help concentrating on a single task. Timing your work, for periods which are of complete focus on a single tasks has the potential to increase productivity and efficiency. The ability to monitor and analyse the time we put to different projects and tasks seems valuable. Recording your work by category, time of the day, day of the week and more can result in better performance and increased productivity. The tool was designed for studying, to allow the use of Pomodoro technique, to keep track of what was done when and how much time was devoted to each thing. The tool should be useful for work, reading, hobbies and other skills one may try to obtain.

Project structure:

  Stable-release: 
    Official releases. 
    Versions are of the format 0.3.x. 
    Stable releases shouldn't have any known bugs.
    Versions should be well documented.
    All implemented features must be first tested as beta releases.
    
  Beta-release: 
    Releases that are meant to introduce new features.
    Versions are of the format 0.3.x.y, where x is the last stable release, and y is the number of beta release since the stable one.
    Beta releases shouldn't have any known bugs.
    Beta-release branch will be merged into Stable-release when it is ready.
    Merging of Betarelease to Stable-release will be done by making a pull request which will be approved by a Code Owner.
    
  Development branches:
    1. Feature branches: branches that are designed for implementing new features.
    2. Bug fixes: branched out of Beta or Stable release, meant for fixing bugs
    3. Refactoring: branches for updating structure and namespace of the project
    Development branches will be merged into the Beta-release branch after they had been tested and documented properly.
    Merging of development branches to Beta-release will be done by making a pull request which will be approved by a Code Owner.
