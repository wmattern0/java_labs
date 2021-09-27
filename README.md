# java_labs

## what is the use of transient keyword?
For an object to be serialized, marks a member variable of the object to be ignored.  This is useful for discarding any variable that should not be included in the object state after transferring an object between different JVMs - like cloud.

Note the transient variable Thread gets reset to the default value null after a serde operation.

```bash
bill@bill-VirtualBox:~/vm/dev/java_labs$ /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF -cp /home/bill/vm/dev/java_labs/target/classes com.wmattern0.FlattenTime
writing out from FlattenTime: Mon Sep 27 08:30:53 EDT 2021
 Thread: 81
bill@bill-VirtualBox:~/vm/dev/java_labs$ /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF -cp /home/bill/vm/dev/java_labs/target/classes com.wmattern0.InflateTime
Flattened time: Mon Sep 27 08:30:53 EDT 2021
 Thread: null

Current time: Mon Sep 27 08:30:55 EDT 2021
```