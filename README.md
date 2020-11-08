# TimeMachine-Java
Time machine in Java.


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
