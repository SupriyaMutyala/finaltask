path = "finaltask/x"

pipelineJob(path) {
    description("This job creates a jumphost to access jenkins agents run in Openstack VMs")
    logRotator {
        daysToKeep(30)
    }
    definition {
        cps {
            script(readFileFromWorkspace("${path}/jenkinsfile.groovy"))
            sandbox(false)
        }
    }
}
