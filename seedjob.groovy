job('Test') {
    steps {
        shell('''
        	echo "hello world"
    	'''.stripIndent())
    }
}
