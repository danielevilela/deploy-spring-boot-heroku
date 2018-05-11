# Deploying a Spring Boot app on Heroku

Heroku is a Plataform as a Service – (PaaS) that enables developers to build, run and manage applications entirely in the cloud.

In this post, following easy steps, you’ll be able to deploy your App in few minutes.
(For this tutorial, I used a simple rest API.) 
You can do all the steps using comand line, but it’s nice to have a perspective on how the plataform works.

## Part I – Create an app on Heroku
Go to the dashboard: https://dashboard.heroku.com/apps.
New -> Create new app

![Create new app](https://danielevilela.files.wordpress.com/2018/05/heroku1.jpg)

Choose your name for the app and then click: Create app. You’ll see something like this:

![Dashboard](https://danielevilela.files.wordpress.com/2018/05/heroku1.jpg)

## Part II – Download and install Heroku CLI
With Heroku CLI you can manage your applications using command line.
You can download it here: [Heroku Dev Center](https://devcenter.heroku.com/articles/heroku-cli#download-and-install)

After installation, enter the following command to login to your Heroku account:

heroku login
You’ll be asked to enter your credentials: email and password

```ruby
heroku: Enter your login credentials
Email:
Password:
Perfect! Now you’re logged in!
```
## Part III – Deploy your application
Execute the following instruction from the root folder from your project:
```ruby
> git init
> heroku git:remote -a YOUR_APP_NAME
> git add .
> git commit -m "First commit"
> git push heroku master
```

Success! After few seconds, you’ll be able to access the link of your application:
https://YOUR_APP_NAME.herokuapp.com

In my case, app running [here](https://rest-spring-boot.herokuapp.com/guests) :)
