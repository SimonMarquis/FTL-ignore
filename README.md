# FTL-ignore

> [!NOTE]  
> Using `com.google.firebase.testlab` in version `0.0.1-alpha05`.  
> Don't forget to include your [`serviceAccountCredentials.json`](serviceAccountCredentials.json).

`@Ignore`d tests will result in task failures:

- ✅ `:lib-default:ftlDeviceDebugAndroidTest` (`matrix-vu9sncwc2x8ea`)
    ```
    Firebase Testlab Test for ftlDevice: state VALIDATING
    Firebase Testlab Test for ftlDevice: state PENDING
    Test request for device ftlDevice has been submitted to Firebase TestLab: https://console.firebase.google.com/project/...
    Firebase Testlab Test for ftlDevice: state FINISHED
    Test execution completed. See the report at: file:///FTL-ignore/lib-default/build/reports/androidTests/managedDevice/debug/allDevices/index.html
    ```

- ❌ `:lib-ignore-test-method:ftlDeviceDebugAndroidTest` (`matrix-1debcf0cijg7p`)
    ```
    Firebase Testlab Test for ftlDevice: state VALIDATING
    Firebase Testlab Test for ftlDevice: state PENDING
    Test request for device ftlDevice has been submitted to Firebase TestLab: https://console.firebase.google.com/project/...
    Firebase Testlab Test for ftlDevice: state FINISHED
    > Task :lib-ignore-test-method:ftlDeviceDebugAndroidTest FAILED

    * What went wrong:
      Execution failed for task ':lib-ignore-test-method:ftlDeviceDebugAndroidTest'.
    > A failure occurred while executing com.android.build.gradle.internal.tasks.ManagedDeviceTestTask$ManagedDeviceTestRunnable
    > 416 Requested range not satisfiable
    Request range not satisfiable
    ```

- ❌ `:lib-ignore-test-class:ftlDeviceDebugAndroidTest` (`matrix-36pt5ardrhhy6`)
    ```
    Firebase Testlab Test for ftlDevice: state VALIDATING
    Firebase Testlab Test for ftlDevice: state PENDING
    Test request for device ftlDevice has been submitted to Firebase TestLab: https://console.firebase.google.com/project/...
    Firebase Testlab Test for ftlDevice: state FINISHED
    > Task :lib-ignore-test-class:ftlDeviceDebugAndroidTest FAILED
    * What went wrong:
      Execution failed for task ':lib-ignore-test-class:ftlDeviceDebugAndroidTest'.
    > A failure occurred while executing com.android.build.gradle.internal.tasks.ManagedDeviceTestTask$ManagedDeviceTestRunnable
    > 416 Requested range not satisfiable
    Request range not satisfiable
    ```
