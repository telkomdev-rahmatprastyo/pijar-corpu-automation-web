pipeline {
    parameters {
    string(name: 'KATALON_OPTS',    description: 'options parse into katalon',             defaultValue: '-apiKey=67241515-57ea-4050-b21a-4404fbfdb1ff -retry=0 -testSuiteCollectionPath=\"Test Suites/Learner/TSC-Request for Course Enrollment\"')
    string(name: 'REPORT_NAME',        description: 'report name ex: Sprint-1 (no space)',         defaultValue: 'LearnAja-SmokeTest-Enrollment Course')
    string(name: 'CREATED_BY',        description: 'PIC Run',             defaultValue: 'Rahmat Prastyo')
    string(name: 'ENV',                description: 'env run automation, please input staging,production, develop',     defaultValue: 'production')
    string(name: 'PROJECT_NAME',                description: 'Your Project name',     defaultValue: 'Learn Aja')
    string(name: 'PROJECT_DETAIL',                description: 'Contact PIC pipeline& Report for yout prohect detail',     defaultValue: '56')
    string(name: 'tokenTelegram',   description: 'token API Teleram',                                   defaultValue: '1296535772:AAE3yVn3p4iUpf95yZo71YAHi7KF6PvaG9Q')
    string(name: 'chatId',          description: 'ID Chat Room',                                        defaultValue: '-322914983')

    }
    agent { label 'docker-qa' }
    options {
        skipDefaultCheckout()
    }
    stages {
        stage ( 'Kill Old Build' ) {
            steps {
                script {
                    cleanWs()
                    deleteDir()
                    echo 'Kill Old Build'
                    
        }   }   }
        stage('Checkout SCM') {
            steps {
                cleanWs()
                checkout scm
                script {
                    echo 'get COMMIT_ID'
                    sh 'echo -n $(git rev-parse --short HEAD) > ./commit-id'
                    commitId = readFile('./commit-id')
                }
                stash(name: 'ws', includes:'**,./commit-id')
            }
        }

        stage('Running Test with Katalon') {
            steps {
                unstash 'ws'
                echo "Run Docker to test Mobile using katalon"
                script{
                    sh "ls"
                    sh "chmod +x delete.sh"
                    sh "./delete.sh"
                    sh "docker run --rm -t \
                       -v ${WORKSPACE}:/katalon/katalon/source \
                       katalonstudio/katalon:6.3.3 \
                       katalon-execute.sh ${params.KATALON_OPTS}"
                }
            }
        }
            }
    post {
        always {
                script {
                Date date = new Date()
                String datePart = date.format('ddMMyyyy')
                String timePart = date.format('HHmmss')
                randomDate = datePart + timePart
                def versionInfo = sh ( script: 'cd report && ls', returnStdout: true).trim()
                folder = versionInfo.split()
                for (i = 0 ; i < folder.length ; i++) {
                    sh "cd report/${folder[i]} && ls -la"
                            sh "curl -X POST \
                            -H 'Authorization: Basic dGVsa29tZGV2cWE6cWFkZXZlbG9wZXIyMDE4' \
                            -H 'Content-Type: multipart/form-data' \
                            -H 'Content-Type: multipart/mixed' \
                            -H 'X-Content-Type-Options: nosniff' \
                            -H 'Postman-Token: b9c93a86-d355-471c-939d-55f5c3802d2d' \
                            -H 'Host: katalon-report-api-dev.vsan-apps.playcourt.id' \
                            -H 'cache-control: no-cache' \
                            -H 'content-type: multipart/form-data;multipart/mixed;text/html; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
                            -F files=@report/'${folder[i]}'/JUnit_Report.xml \
                            -F projectDetailId=${params.PROJECT_DETAIL} \
                            -F reportName='${params.REPORT_NAME}-${randomDate}' \
                            -F reportLink='${params.REPORT_NAME}-${folder[i]}'.html \
                            -F createdBy=${params.CREATED_BY}\
                            -F env=${params.ENV}\
                            -H 'Content-Type: text/html' \
                            -F html=@report/'${folder[i]}'/report.html \
                            -F reportPDF='${params.REPORT_NAME}-${folder[i]}'.pdf \
                            -F pdf=@report/'${folder[i]}'/'${folder[i]}'.pdf \
                            http://katalon-report-api-dev.vsan-apps.playcourt.id/api/v1/add-report"
                          
                      }  
                     if ("${currentBuild.result}" != 'SUCCESS') {
                        textMessage = java.net.URLEncoder.encode("WEB TEST: ${PROJECT_NAME} on ${ENV} FAILED RUNNING.\n - ReportName: ${REPORT_NAME}-${randomDate},\n - Created by: ${CREATED_BY},\n Check your report on https://automation-report-dev.telkomdigitalsolution.co/")
                    } else {
                        textMessage = java.net.URLEncoder.encode("WEB TEST: ${PROJECT_NAME} on ${ENV} SUCCESS RUNNING.\n - ReportName: ${REPORT_NAME}-${randomDate},\n - Created by: ${CREATED_BY},\n Check your report on https://automation-report-dev.telkomdigitalsolution.co/")
                    }
                      sh "curl -X POST 'https://api.telegram.org/bot${tokenTelegram}/sendMessage?chat_id=${chatId}&text=${textMessage}'"


}   }   }   }   
