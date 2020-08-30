# Play RabbitMQ Module


[![Latest release](https://img.shields.io/badge/latest_release-20.08-orange.svg)](https://github.com/thibaultmeyer/play-rabbitmq-module/releases)
[![JitPack](https://jitpack.io/v/thibaultmeyer/play-rabbitmq-module.svg)](https://jitpack.io/#thibaultmeyer/play-rabbitmq-module)
[![Build](https://api.travis-ci.org/thibaultmeyer/play-rabbitmq-module.svg)](https://travis-ci.org/thibaultmeyer/play-rabbitmq-module)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/thibaultmeyer/play-rabbitmq-module/master/LICENSE)

RabbitMQ simple module for Play Framework 2
*****

## Add play-rabbitmq-module to your project

#### build.sbt

    resolvers += "jitpack" at "https://jitpack.io"

    libraryDependencies += "com.github.thibaultmeyer" % "play-rabbitmq-module" % "release~YY.MM"

#### application.conf

    # Play Modules
    # ~~~~~
    play.modules.enabled += "com.zero_x_baadf00d.play.module.rabbitmq.RabbitMQBinder"


    # Play Redis Module
    # ~~~~~
    rabbitmq {
      conn {
        uri = "amqp://<LOGIN>:<PASSWORD>@<HOST>/<VHOST>"
        heartbeart = 60
        networkRecoveryInterval = 5000
        connectionTimeOut = 30000
        executorService = 50
        automaticRecovery = false
        bypassInitError = false
      }

      channels {
        # Dynamic channel name
        my-queue-name {
          # durable - RabbitMQ will never lose the queue if a crash occurs
          durable = true
          # exclusive - if queue only will be used by one connection
          exclusive = false
          # autoDelete - queue is deleted when last consumer unsubscribes
          autoDelete = false
        }
      }
    }



## License
This project is released under terms of the [MIT license](https://raw.githubusercontent.com/thibaultmeyer/play-rabbitmq-module/master/LICENSE).
