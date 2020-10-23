# -Kotlin-MVVM-LiveData-Retrofit-Coroutine-DataBinding

# kotlin-mvvm
Languages: [English](README.md)

[![Kotlin](https://img.shields.io/badge/kotlin-1.3.21-blue.svg)](http://kotlinlang.org) [![Gradle](https://img.shields.io/badge/gradle-3.3.2-%2366DCB8.svg)](https://developer.android.com/studio/releases/gradle-plugin) [![Mockito](https://img.shields.io/badge/mockito-2.27.0-orange.svg)](https://site.mockito.org/)

MVVM(Model View ViewModel) sample in Kotlin using the components ViewModel, LiveData, the libraries Retrofit, coroutine and Data Binding .

### MVVM Pattern (Model View ViewModel)
 <img src="assets/AndroidMVVM.png">


### Architecture
<img src="assets/architecture.png" height="540">

### Flow
<img src="assets/MVVMFlow.png" height="540">
 

### Slides

Android MVVM https://docs.google.com/presentation/d/1nTwtU8OWYs_8Q3i_3hOPAWodDpDKzO--uA-4b6LUr8g/edit?usp=sharing

Android MVVM Clean https://docs.google.com/presentation/d/1luTzvqGaMjVycEx109-AjYIj3FIpXYAt3Mnu-gjqxtc/edit?usp=sharing

### Updates [August 2020]

- Added dependency injection with Hilt, included android tests [branch hilt](https://github.com/emedinaa/kotlin-mvvm/tree/hilt)

- Added unit tests with Flow [branch flow](https://github.com/emedinaa/kotlin-mvvm/tree/flow)

- Added kotlin Flow and fragment ktx [branch flow](https://github.com/emedinaa/kotlin-mvvm/tree/flow)

- Room [branch room](https://github.com/emedinaa/kotlin-mvvm/tree/room)

- Added View Binding [branch viewbinding](https://github.com/emedinaa/kotlin-mvvm/tree/viewbinding)

- Dependencies versions were updated and ViewModelProviders class was removed (deprecated). [all branches](https://github.com/emedinaa/kotlin-mvvm/)

- Added Coroutines with retrofit and sealed classes to replace callbacks. Included testing with Coroutines. [branch coroutines](https://github.com/emedinaa/kotlin-mvvm/tree/coroutines)


- Added Unit Testing with Mockito (27th May) [Link](https://github.com/emedinaa/kotlin-mvvm/commit/92d9e5a659c21178364d0b51e904fd126b0b6204)

- Fix load images android P by Carlos Ugaz [carlosgub](https://github.com/carlosgub) [Link](https://github.com/emedinaa/kotlin-mvvm/pull/1)


### Dependencies

- Retrofit 2 [version: '2.3.0'](https://square.github.io/retrofit/)
- OkHttp 3 [version: '3.4.1'](https://square.github.io/okhttp/)
- AndroidX [version: '1.2.0'](https://mvnrepository.com/artifact/androidx)
- Arch Lifecycle [version: '2.2.0'](https://developer.android.com/jetpack/androidx/releases/lifecycle)

### References

- ViewModel https://developer.android.com/topic/libraries/architecture/viewmodel
- LiveData https://developer.android.com/topic/libraries/architecture/livedata
- Android Architecture Blueprints https://github.com/googlesamples/android-architecture
- Android Jetpack: ViewModel https://www.youtube.com/watch?v=5qlIPTDE274
- Unit Testing + Mockito + Kotlin + Architecture components https://medium.com/@marco_cattaneo/unit-testing-with-mockito-on-kotlin-android-project-with-architecture-components-2059eb637912
- Junit + LiveData https://jeroenmols.com/blog/2019/01/17/livedatajunit5/

### Contributing and reporting issues

You can to contribute in this repository. 

I appreciate any question or comment. Also, if you consider it useful, you can give me a star ⭐ ⭐ ⭐ ⭐ ⭐.
