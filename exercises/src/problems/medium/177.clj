(ns problems.medium.177)

(comment "Balancing Brackets")


(comment "When parsing a snippet of code it's often a good idea to do a
sanity check to see if all the brackets match up. Write a function that takes in
a string and returns truthy if all square [ ] round ( ) and curly { } brackets are
properly paired and legally nested, or returns falsey otherwise.")


(defn solution
  [& args])


(assert (and (solution "This string has no brackets.")
             (solution "class Test {\n                          public static void main(String[] args) {\n                            System.out.println(\"Hello world.\");\n                          }\n                        }")
             (not (solution "(start, end]"))
             (not (solution "())"))
             (not (solution "[ { ] } "))
             (solution "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")
             (not (solution "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))
             (not (solution "["))))
