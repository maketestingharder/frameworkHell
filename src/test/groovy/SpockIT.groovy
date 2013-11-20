import spock.lang.Specification

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
class SpockIT extends Specification{

    def setup(){
        println("Spock Integration test - setup")
    }

    def "sample Spock integration test"(){
        when:
        println("Spock Integration test - test @when")
        then:
        2 == 2
        println("Spock Integration test - test @then")
    }
}
