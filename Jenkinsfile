stage 'build_Project'
node{
  if(isUnix()){
  sh '/usr/local/bin/gradle build --info'

  }
  else{
    bat 'gradle build --info'
  }
}