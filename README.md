# Play RabbitMQ Module


[![Latest release](https://img.shields.io/badge/latest_release-16.05-orange.svg)](https://github.com/0xbaadf00d/play-rabbitmq-module/releases)
[![JitPack](https://jitpack.io/v/0xbaadf00d/play-rabbitmq-module.svg)](https://jitpack.io/#0xbaadf00d/play-rabbitmq-module)
[![Build](https://img.shields.io/travis-ci/0xbaadf00d/play-rabbitmq-module.svg?branch=master&style=flat)](https://travis-ci.org/0xbaadf00d/play-rabbitmq-module)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/0xbaadf00d/play-rabbitmq-module/master/LICENSE)

RabbitMQ simple module for Play Framework 2
*****

## Add play-rabbitmq-module to your project

#### build.sbt

    resolvers += "jitpack" at "https://jitpack.io"

    libraryDependencies += "com.github.0xbaadf00d" % "play-rabbitmq-module" % "release~YY.MM"

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
This project is released under terms of the [MIT license](https://raw.githubusercontent.com/0xbaadf00d/play-rabbitmq-module/master/LICENSE).
