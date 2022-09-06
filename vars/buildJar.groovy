#!/usr/bin/env groovy
def call(){
    echo "building the application..."
    sh 'mvn package'
    echo "building the branch $BRANCH_NAME"
}