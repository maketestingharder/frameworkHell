import spock.lang.Specification

/**
 * email: maketestingharder@gmail.com
 * blog: www.maketestingharder.blogspot.com
 * FB: www.facebook.com/maketestingharder
 */
class SpockUnitTest extends Specification{

    def setup(){
       println("Spock Unit test - setup")
    }

    def "sample Spock unit test"(){
        when:
        println("Spock Unit test - test @when")
        then:
        2 == 2
        println("Spock Unit test - test @then")
    }
}
