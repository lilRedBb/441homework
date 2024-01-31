In your repository, add a file named REFLECTION.md with a brief reflection on the process and learning experience.

Questions for Reflection:

What challenges did you encounter while setting up the CI pipeline?

1,to construct unit test for maven project, learn how to use Junit, learn how to write test code.
2,to compose yml file for workflow, basic content to let workflow build maven, and run test.
3,during push, the auto-build failed all the time, need to modify the yml file, by changing jdk version and giving encode
4,local file structure is also a matter which cause build maven fail on github, need to set the test source and source root correctly
5,for release workflow, you need to add id for the release step so that the asset step will catch on with it
6,when adding and deleting tags, you need to do it locally and remotely.
7,workspace.xml file should not be push to remote, the fix that problem, I have to delete the file on remote and in local git cache.


How does CI benefit software development projects?
1,the code can be build and test on git, which gives early detection and test.
2,versions of code are store on git environment, so, release version can be switched.
3,code on server can be easily deploy in different environment.