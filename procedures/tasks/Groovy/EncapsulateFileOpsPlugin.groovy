procedure 'EncapsulateFileOpsPlugin', {
  description = ''
  jobNameTemplate = ''
  projectName = 'Default'
  resourceName = ''
  timeLimit = ''
  timeLimitUnits = 'minutes'
  workspaceName = ''

  formalOutputParameter 'result', {
    description = ''
  }

  step 'DirectoryExists', {
    description = ''
    alwaysRun = '0'
    broadcast = '0'
    condition = ''
    errorHandling = 'failProcedure'
    exclusiveMode = 'none'
    parallel = '0'
    precondition = ''
    releaseMode = 'none'
    resourceName = 'local'
    subprocedure = 'DirectoryExists'
    subproject = '/plugins/EC-FileOps/project'
    timeLimit = ''
    timeLimitUnits = 'minutes'
    workspaceName = ''
    actualParameter 'Path', '/tmp/dir'
  }

  step 'Fill Output Parameter', {
    description = ''
    alwaysRun = '0'
    broadcast = '0'
    command = 'ectool setOutputParameter "result" "$[/myJobStep/parent/jobSteps[DirectoryExists]/outcome]"'
    condition = ''
    errorHandling = 'failProcedure'
    exclusiveMode = 'none'
    logFileName = ''
    parallel = '0'
    postProcessor = ''
    precondition = ''
    releaseMode = 'none'
    resourceName = 'local'
    shell = ''
    subprocedure = ''
    subproject = ''
    timeLimit = ''
    timeLimitUnits = 'minutes'
    workingDirectory = ''
    workspaceName = ''
  }

  // Custom properties

  property 'ec_customEditorData', {

    // Custom properties
    formType = 'standard'
  }
}