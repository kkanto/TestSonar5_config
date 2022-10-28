 
listView('TestSonar5 Jobs') {
    description('TestSonar5 Jobs')
    jobs {
        regex('TestSonar5_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
